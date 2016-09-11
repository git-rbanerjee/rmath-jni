package org.rmath.generate;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Rabin Banerjee
 *
 */
public class GenerateC {
	
	public static String parseHfileAndGenerateCCode(String headerFile)
	{
		boolean start = false;
		boolean end = false;
		String methodName = "";
		StringBuilder fnl = new StringBuilder();
		fnl.append("\n\n//Author:: Rabin Banerjee \n\n\n");
		fnl.append("#define MATHLIB_STANDALONE 1 \n");
		fnl.append("#include \"JNIRMathNative.h\" \n");
		fnl.append("#include \"include/Rmath.h\" \n");


		try(BufferedReader br = new BufferedReader(new FileReader(headerFile)))
		{
			
			String inp;
			while((inp=br.readLine())!=null)
			{
				if(!start && inp.contains("JNIEXPORT"))
				{
					start = true;
				}
				if(!end && start && inp.startsWith("#ifdef __cplusplus"))
				{
					end = true;
				}
				
				if(start && !end)
				{
					if(inp.startsWith("JNIEXPORT"))
					{
						String[] splits = inp.split("_");
						methodName = splits[splits.length-1];
						fnl.append(inp);
					}
					else if(inp.contains("JNIEnv ") && inp.contains("jobject"))
					{
						
						String[] splits=inp.replace("(", "").replace(")", "").replace(";", "").split(",");
						StringBuilder sb = new StringBuilder();
						StringBuilder reparams=new StringBuilder();
						sb.append("(");
						sb.append(splits[0]+" env,");
						sb.append(splits[1]+" obj,");
						reparams.append("(");
						for(int i=2;i<splits.length;i++){
							sb.append(splits[i]+" p"+(i-1));
							reparams.append("p"+(i-1));
							if(i !=splits.length-1){
								sb.append(",");
								reparams.append(",");
							}
						}
						reparams.append(')');
						sb.append("){");
						sb.append("\n\treturn "+ methodName+reparams.toString()+";");
						sb.append("\n}");
						fnl.append(sb.toString());
					}
					else
					{
						fnl.append(inp+"\n");
					}
					
				}
					
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fnl.toString();
	}
	
	
	
	public static void main(String[] args) throws IOException
	{
		
		String text = parseHfileAndGenerateCCode("native/JNIRMathNative.h");
		Files.write(Paths.get("native/JNIRMathNative.c"), text.getBytes());
	}

}
