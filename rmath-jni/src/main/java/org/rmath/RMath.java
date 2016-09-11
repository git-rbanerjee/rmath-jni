package org.rmath;


public class RMath {
	private static RMathNative impl;
	
	static {
        try {
            impl = RMathLoader.load();
        }
        catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
	
	
	public static double ppois(double x, double lb, boolean lt, boolean lg){
		
		return impl.ppois(x, lb, lt?1:0, lg?1:0);
	}
	
	public static void main(String[] args)
	{
		double result = RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,false,false);
		System.out.println(result);
	}

}
