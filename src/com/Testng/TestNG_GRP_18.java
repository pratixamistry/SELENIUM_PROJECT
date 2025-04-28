package com.Testng;

import org.testng.annotations.Test;

public class TestNG_GRP_18 {
	@Test(groups = "red")
	  public void red1() {
		  System.out.println("This is group red 1...");
	  }
	  
	  @Test(groups = "red")
	  public void red2() {
		  System.out.println("This is group red 2...");
	  }
	  
	  @Test(groups = "red")
	  public void red3() {
		  System.out.println("This is group red 3...");
	  }
	  
	  @Test(groups = "green")
	  public void green1() {
		  System.out.println("This is group green 1...");
	  }
	  
	  @Test(groups = { "green"})
	  public void green2() {
		  System.out.println("This is group green 2...");
	  }
	  
	  @Test(groups = "green")
	  public void green3() {
		  System.out.println("This is group green 3...");
	  }
	  
	  @Test(groups = {"green", "red"})
	  public void greenAndRed() {
		  System.out.println("This is group red and green...");
	  }
	  
}
