package com.jni.test;

//export SPARK_LIBRARY_PATH=/path/to/native/library
public class TestRes {
	
	public static void main(String[] ars)
	{
		/*File ff = new File("/tmp/dll-libs/");
		if(!ff.exists())
			ff.mkdir();
		try {
			// Prepare buffer for data copying
	        byte[] buffer = new byte[1024];
	        int readBytes;
	        Configuration conf = new Configuration();
			conf.set("fs.defaultFS", "hdfs://localhost/");
	     
			FileSystem fs = FileSystem.get(conf);
			FileStatus[] flss = fs.listStatus(new Path("hdfs:///user/cloudera/dll-libs/"));
			
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
		}*/
	}

}
