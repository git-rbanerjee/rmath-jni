
package org.rmath;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.UUID;

import org.rmath.util.OSInfo;

/**
 * 
 * @author Rabin Banerjee
 *
 */
public class RMathLoader
{
    public static final String KEY_RMATH_LIB_PATH = "org.rmath.lib.path";
    public static final String KEY_RMATH_LIB_NAME = "org.rmath.lib.name";
    public static final String KEY_RMATH_TEMPDIR = "org.rmath.lib.tempdir";

    private static volatile boolean isLoaded = false;
    private static volatile RMathNative api = null;

    private static File nativeLibFile = null;

    static void cleanUpExtractedNativeLib()
    {
        if (nativeLibFile != null && nativeLibFile.exists()) {
            boolean deleted = nativeLibFile.delete();
            if (!deleted) {
                // Deleting native lib has failed, but it's not serious so simply ignore it here
            }
        }
    }

    /**
     * Set the api instance.
     *
     * @param nativeCode
     */
    static synchronized void setApi(RMathNative nativeCode)
    {
        api = nativeCode;
    }

   

    public static synchronized RMathNative load()
    {
        if (api != null) {
            return api;
        }

        try {
            loadNativeLibrary();

            setApi(new RMathNative());
            isLoaded = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return api;
    }

    /**
     * Load a native library of rmath-java
     */
    private static void loadNativeLibrary()
    {

        nativeLibFile = findNativeLibrary();
        if (nativeLibFile != null) {
            // Load extracted or specified rmathjava native library.
            System.load(nativeLibFile.getAbsolutePath());
        }
        else {
            // Load preinstalled rmathjava (in the path -Djava.library.path)
            System.loadLibrary("jnirmath");
        }
    }

    private static boolean contentsEquals(InputStream in1, InputStream in2)
            throws IOException
    {
        if (!(in1 instanceof BufferedInputStream)) {
            in1 = new BufferedInputStream(in1);
        }
        if (!(in2 instanceof BufferedInputStream)) {
            in2 = new BufferedInputStream(in2);
        }

        int ch = in1.read();
        while (ch != -1) {
            int ch2 = in2.read();
            if (ch != ch2) {
                return false;
            }
            ch = in1.read();
        }
        int ch2 = in2.read();
        return ch2 == -1;
    }

    /**
     * Extract the specified library file to the target folder
     *
     * @param libFolderForCurrentOS
     * @param libraryFileName
     * @param targetFolder
     * @return
     */
    private static File extractLibraryFile(String libFolderForCurrentOS, String libraryFileName, String targetFolder)
    {
        String nativeLibraryFilePath = libFolderForCurrentOS + "/" + libraryFileName;

        // Attach UUID to the native library file to ensure multiple class loaders can read the jnirmath multiple times.
        String uuid = UUID.randomUUID().toString();
        String extractedLibFileName = String.format("jnirmath-%s-%s-%s", getVersion(), uuid, libraryFileName);
        File extractedLibFile = new File(targetFolder, extractedLibFileName);
        System.out.println("Extracting jar to :: "+extractedLibFile);

        try {
            // Extract a native library file into the target directory
            InputStream reader = null;
            FileOutputStream writer = null;
            try {
                reader = RMathLoader.class.getResourceAsStream(nativeLibraryFilePath);
                try {
                    writer = new FileOutputStream(extractedLibFile);

                    byte[] buffer = new byte[8192];
                    int bytesRead = 0;
                    while ((bytesRead = reader.read(buffer)) != -1) {
                        writer.write(buffer, 0, bytesRead);
                    }
                }
                finally {
                    if (writer != null) {
                        writer.close();
                    }
                }
            }
            finally {
                if (reader != null) {
                    reader.close();
                }

                // Delete the extracted lib file on JVM exit.
                extractedLibFile.deleteOnExit();
            }

            // Set executable (x) flag to enable Java to load the native library
            boolean success = extractedLibFile.setReadable(true) &&
                    extractedLibFile.setWritable(true, true) &&
                    extractedLibFile.setExecutable(true);
            if (!success) {
                // Setting file flag may fail, but in this case another error will be thrown in later phase
            }

            // Check whether the contents are properly copied from the resource folder
            {
                InputStream nativeIn = null;
                InputStream extractedLibIn = null;
                try {
                    nativeIn = RMathLoader.class.getResourceAsStream(nativeLibraryFilePath);
                    extractedLibIn = new FileInputStream(extractedLibFile);

                    if (!contentsEquals(nativeIn, extractedLibIn)) {
                        throw new RMathError(RMathErrorCode.FAILED_TO_LOAD_NATIVE_LIBRARY, String.format("Failed to write a native library file at %s", extractedLibFile));
                    }
                }
                finally {
                    if (nativeIn != null) {
                        nativeIn.close();
                    }
                    if (extractedLibIn != null) {
                        extractedLibIn.close();
                    }
                }
            }

            return new File(targetFolder, extractedLibFileName);
        }
        catch (IOException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }

    static File findNativeLibrary()
    {

        
        String rmathNativeLibraryPath = System.getProperty(KEY_RMATH_LIB_PATH);
        String rmathNativeLibraryName = System.getProperty(KEY_RMATH_LIB_NAME);

        // Resolve the library file name with a suffix (e.g., dll, .so, etc.) 
        if (rmathNativeLibraryName == null) {
            rmathNativeLibraryName = System.mapLibraryName("jnirmath");
        }

        if (rmathNativeLibraryPath != null) {
            File nativeLib = new File(rmathNativeLibraryPath, rmathNativeLibraryName);
            if (nativeLib.exists()) {
                return nativeLib;
            }
        }

        // Load an OS-dependent native library inside a jar file
        rmathNativeLibraryPath = "/" + OSInfo.getNativeLibFolderPathForCurrentOS();
        boolean hasNativeLib = hasResource(rmathNativeLibraryPath + "/" + rmathNativeLibraryName);
        if (!hasNativeLib) {
            if (OSInfo.getOSName().equals("Mac")) {
                // Fix for openjdk7 for Mac
                String altName = "libjnirmath.jnilib";
                if (hasResource(rmathNativeLibraryPath + "/" + altName)) {
                    rmathNativeLibraryName = altName;
                    hasNativeLib = true;
                }
            }
        }

        if (!hasNativeLib) {
            String errorMessage = String.format("no native library is found for os.name=%s and os.arch=%s", OSInfo.getOSName(), OSInfo.getArchName());
            throw new RMathError(RMathErrorCode.FAILED_TO_LOAD_NATIVE_LIBRARY, errorMessage);
        }

        // Temporary folder for the native lib. Use the value of org.xerial.rmath.tempdir or java.io.tmpdir
        File tempFolder = new File(System.getProperty(KEY_RMATH_TEMPDIR, System.getProperty("java.io.tmpdir")));
        if (!tempFolder.exists()) {
            boolean created = tempFolder.mkdirs();
            if (!created) {
                // if created == false, it will fail eventually in the later part
            }
        }

        // Extract and load a native library inside the jar file
        return extractLibraryFile(rmathNativeLibraryPath, rmathNativeLibraryName, tempFolder.getAbsolutePath());
    }

    private static boolean hasResource(String path)
    {
        return RMathLoader.class.getResource(path) != null;
    }

    /**
     * Get the rmath-java version by reading pom.properties embedded in jar.
     * This version data is used as a suffix of a dll file extracted from the
     * jar.
     *
     * @return the version string
     */
    public static String getVersion()
    {
        URL versionFile = RMathLoader.class
                .getResource("/META-INF/maven/org.rmath/rmath-jni/pom.properties");
        if (versionFile == null) {
            versionFile = RMathLoader.class.getResource("/VERSION");
        }

        String version = "unknown";
        try {
            if (versionFile != null) {
                Properties versionData = new Properties();
                versionData.load(versionFile.openStream());
                version = versionData.getProperty("version", version);
                if (version.equals("unknown")) {
                    version = versionData.getProperty("VERSION", version);
                }
                version = version.trim().replaceAll("[^0-9M\\.]", "");
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }
        return version;
    }
}