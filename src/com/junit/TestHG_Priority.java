package com.junit;

import org.testng.annotations.Test;

public class TestHG_Priority {

	@Test(priority = 2)
	public void test() {
		System.out.println("This is test...");
	}
	
	@Test(priority = 0)
	public void best() {
		System.out.println("This is best...");
	}
	
	@Test(priority = 1)
	public void fest() {
		System.out.println("This is fest...");
	}
	
	@Test(priority = 4)
	public void nest() {
		System.out.println("This is nest...");
	}
}
