package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//W.a. TestNG program to perform test with webdriver to login processof facebook

public class TestNG_FB_15 {
WebDriver driver;
	
	@BeforeTest
	public void before() {
		 System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
	}
	
	@Test(priority = 2)
	public void login() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void password() throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(priority = 0)
	public void username() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
}
