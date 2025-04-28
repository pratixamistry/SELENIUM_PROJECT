package com.Testng;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;



public class FirstDemo {

	@Test
	public void test1() {
		System.out.println("This test is passed");
	}
	
	@Test
	public void test2() {
		System.out.println("This test is failed");
		fail();
	}
	
	@Test
	public void test3() {
		System.out.println("This test is passed");
		throw new SkipException("Self Skipped!!!");
	}
}
