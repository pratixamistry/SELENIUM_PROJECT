package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	@BeforeClass
	public void before() {
		System.out.println("before class...");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test...");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before every method...");
	}
	
	@Test
	public void test1() {
		System.out.println("this is test 1...");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2...");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after every method...");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test...");
	}
	
	
	
	@AfterClass
	public void after() {
		System.out.println("after class...");
	}
}
