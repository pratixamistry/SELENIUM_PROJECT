
package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_annotationDemo {
	
	@BeforeClass		// run before class loads,thats why must be static
	public static void beforeClass() {
		System.out.println("Before class");
	}

	@Before   // executes before every method
	public void before() {
		System.out.println("before every method!!");
	}
	
	@After		// executes after every method
	public void after() {
		System.err.println("after every method!!");
	}
	
	@Test  		// to execute the method, if Test annotation is not given method will not execute
	public void test1() {
		System.out.println("this is first test");
	}
	
	@Ignore		// do not run this method
	@Test
	public void test2() {
		System.out.println("this is second test");
	}
	
	@AfterClass		// executes after class
	public static void afterClass() {
		System.out.println("Before class");
	}
}
