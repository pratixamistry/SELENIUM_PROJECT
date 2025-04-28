package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//•	17 W.a. TestNG program to use parameterized demo with multiple 
//parameter of Facebook login with TestNG.

public class TestNG_FB_Para_17 {
	WebDriver driver;
	  @Test
	  @Parameters({"username","password"})  // variable from TestNG2 file, keep same
	  public void f(String username, String password) throws InterruptedException {
		  
		  
		  System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
					
			
				driver.findElement(By.id("email")).sendKeys(username);
				Thread.sleep(2000);
			
				driver.findElement(By.id("pass")).sendKeys(password);
				Thread.sleep(2000);

				driver.findElement(By.name("login")).click();
				Thread.sleep(2000);
			
				driver.close();
		
	  }
}
