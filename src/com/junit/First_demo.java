package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

public class First_demo {
	
	// no main method
	// use annotation to run method
	// method which is not given Test annotation will not run
	
	@Test
	public void test() {
		System.out.println("this test is pass");
	}
	
	@Test
	public void test1() {
		System.out.println("this test is fail");
		fail(); // mark output as fail
		
	}
	

}
