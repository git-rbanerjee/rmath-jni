package com.jni.test;

import org.junit.Assert;
import org.junit.Test;
import org.rmath.RMath;
import static org.hamcrest.CoreMatchers.*;
public class TestRmath {
	
	@Test
	public void testPPOIS()
	{
		double result = RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,false,false);
		double actual = 7.454657589191258E-112;
		Assert.assertThat(actual, is(result));
	}

}
