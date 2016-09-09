package com.jni;

import java.io.IOException;

public class RMath {
	
	static{
		

		try {
			LoaderUtil.extractLibraryFromJar("/linux-x86-64/libjnirmath.so");
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public static native double ppois(double x, double lb, int lt, int lg);
	
	public static void main(String[] args)
	{
		System.out.println(RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,0,0) );
	}

}
