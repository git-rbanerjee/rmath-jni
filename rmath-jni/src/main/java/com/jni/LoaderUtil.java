package com.jni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LoaderUtil {
	
	/*public static void hdfscopySo()
	{
		
			File ff = new File("/tmp/dll-libs/");
			if(!ff.exists())
				ff.mkdir();
		
		try {
			// Prepare buffer for data copying
	        byte[] buffer = new byte[1024];
	        int readBytes;
	        Configuration conf = new Configuration();
			conf.set("fs.defaultFS", "hdfs://localhost/");
	     
			FileSystem fs = FileSystem.get(conf);
			FileStatus[] flss = fs.listStatus(new Path("hdfs:///tmp/dll-libs/"));
			
			for(FileStatus fls:flss)
			{

				InputStream is = fs.open(fls.getPath());
				
				// Open output stream and copy data between source file in JAR and the temporary file
		        OutputStream os = new FileOutputStream("/tmp/dll-libs/"+fls.getPath().getName());
		        try {
		            while ((readBytes = is.read(buffer)) != -1) {
		                os.write(buffer, 0, readBytes);
		            }
		        } finally {
		            // If read/write fails, close streams safely before throwing an exception
		            os.close();
		            is.close();
		        }
			}
			
			InputStream is = fs.open(new Path("/user/cloudera/dll-libs/"));
			
			// Open output stream and copy data between source file in JAR and the temporary file
	        OutputStream os = new FileOutputStream("/tmp/dll-libs/");
	        try {
	            while ((readBytes = is.read(buffer)) != -1) {
	                os.write(buffer, 0, readBytes);
	            }
	        } finally {
	            // If read/write fails, close streams safely before throwing an exception
	            os.close();
	            is.close();
	        }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public static void extractLibraryFromJar(String path) throws IOException {
		 
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException("The path has to be absolute (start with '/').");
        }
 
        // Obtain filename from path
        String[] parts = path.split("/");
        String filename = (parts.length > 1) ? parts[parts.length - 1] : null;
 
        // Split filename to prexif and suffix (extension)
        String prefix = "";
        String suffix = null;
        if (filename != null) {
            parts = filename.split("\\.", 2);
            prefix = parts[0];
            suffix = (parts.length > 1) ? "."+parts[parts.length - 1] : null; // Thanks, davs! :-)
        }
 
        // Check if the filename is okay
        if (filename == null || prefix.length() < 3) {
            throw new IllegalArgumentException("The filename has to be at least 3 characters long.");
        }
 
        // Prepare temporary file
        File temp = File.createTempFile(prefix, suffix);
        temp.deleteOnExit();
 
        if (!temp.exists()) {
            throw new FileNotFoundException("File " + temp.getAbsolutePath() + " does not exist.");
        }
 
        // Prepare buffer for data copying
        byte[] buffer = new byte[1024];
        int readBytes;
 
        // Open and check input stream
        InputStream is = RMath.class.getResourceAsStream(path);
        if (is == null) {
            throw new FileNotFoundException("File " + path + " was not found inside JAR.");
        }
        
        // Open output stream and copy data between source file in JAR and the temporary file
        OutputStream os = new FileOutputStream(temp);
        try {
            while ((readBytes = is.read(buffer)) != -1) {
                os.write(buffer, 0, readBytes);
            }
        } finally {
            // If read/write fails, close streams safely before throwing an exception
            os.close();
            is.close();
        }
 
        // Finally, load the library
        System.load(temp.getAbsolutePath());

    }


}
