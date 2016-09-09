package com.jni.test;

import com.jni.RMath;

public class TestRMath {
	
	static {
		  
	      // hello.dll (Windows) or libhello.so (Unixes)
	      
	   }
	
	public static void main(String[] args)
	{
		System.out.println(RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,0,0) );
	}

}
