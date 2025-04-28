package com.junit;

import org.junit.Before;
import org.junit.Test;

public class Junit_Exception {

	
	//Initialize object of class globally so can be used in all methods
	Arithmetic_Example aExample;
	
	@Before
	public void before() {
		aExample =new Arithmetic_Example();		
	}
	
	// throw specific Exception orroot class "Exception"
	@Test(expected = ArithmeticException.class)
	public void test() {
		aExample.getException(10, 0);
	}
	
}
