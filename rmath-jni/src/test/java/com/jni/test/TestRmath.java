package com.jni.test;

import org.junit.Assert;

import org.junit.Test;
import org.rmath.RMath;
import static org.hamcrest.CoreMatchers.*;
/**
 * 
 * @author Rabin Banerjee
 *
 */
public class TestRmath {
	
	@Test
	public void testPPOIS()
	{
		double actual = RMath.ppois(19,33322.0 * 0.000692144915267599 / 1000000,false,false);
		double expected = 7.454657589191258E-112;
		Assert.assertThat(actual, is(expected));
	}

}
