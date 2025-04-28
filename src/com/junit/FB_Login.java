package com.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class FB_Login {
	
	
	
	public void login ( String email_id, String password) throws InterruptedException {
		
		WebDriver driver;		
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
		
		//return (first_number+second_number);
		driver.findElement(By.cssSelector("input#email")).sendKeys(email_id);
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys(password);
		Thread.sleep(1000);
		driver.close();
	}

	
	
	
	
	
	
	
//	driver.findElement(By.name("login")).click();
//	Thread.sleep(20000);
	
}
