package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_webdriver {
	
	WebDriver driver;
	
	@BeforeTest
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
	}
	
	@Test(priority = 2)
	public void login() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(priority = 0)
	public void username() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	

}
