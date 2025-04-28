package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Junit_WebDriver {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void Before() {
		
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		//WebDriver driver = new EdgeDriver();
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("react-burger-menu-btn"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout_sidebar_link"));
		Thread.sleep(2000);
	}
	
	
	@AfterClass
	public static void After() {
		driver.close();
	}
	

}
