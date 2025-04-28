package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gmail_login_13 {
static WebDriver driver;
	
	//@BeforeClass
@Test
	public void Before() {
//		
//		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
//		driver = new EdgeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=gmail+login+another+account&sca_esv=dc6106be4f2539d9&sxsrf=AHTn8zrKSnoTyti95B76Wqx4g9_fqdT7xw%3A1741413936134&ei=MN7LZ5P4B7qthbIP9ufEsQ8&oq=gmail+login+another&gs_lp=Egxnd3Mtd2l6LXNlcnAiE2dtYWlsIGxvZ2luIGFub3RoZXIqAggAMgoQABiABBgUGIcCMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAESLwfUMIGWIsVcAF4AZABAJgBtwKgAdoOqgEHMC4xLjYuMbgBA8gBAPgBAZgCCaACpA_CAgoQABiwAxjWBBhHwgINEAAYgAQYsAMYQxiKBcICChAAGIAEGEMYigWYAwCIBgGQBgqSBwcxLjEuNi4xoAeAMw&sclient=gws-wiz-serp");
		
		driver.manage().window().maximize();
	}
	
	
//	@Test
//	public void test() throws InterruptedException {
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("react-burger-menu-btn"));
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("logout_sidebar_link"));
//		Thread.sleep(2000);
//	}
//	
//	
//	@AfterClass
//	public static void After() {
//		driver.close();
//	}
	

}
