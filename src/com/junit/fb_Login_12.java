package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb_Login_12 {
	
	static WebDriver driver=null;
	@BeforeClass
	public static void Before() {
		
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		driver = new EdgeDriver();
//		
//		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
	}
	
@AfterClass
public static void After() {
	driver.close();
}
	
	
}
