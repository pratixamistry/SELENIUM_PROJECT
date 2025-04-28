package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	// in TestNG Run Xml file
	
	WebDriver driver;
  @Test
  @Parameters({"username","password"})  // variable from TestNG2 file, keep same
  public void f(String username, String password) throws InterruptedException {
	  
	  
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();	
		
			driver.findElement(By.id("user-name")).sendKeys(username);
			Thread.sleep(2000);
		
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(2000);

			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
		
			driver.close();
	
  }
}
