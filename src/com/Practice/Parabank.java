package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Parabank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		// USING NAME
		
		driver.findElement(By.name("username")).sendKeys("new_user");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);	
	
		// USING CLASS		
		driver.findElement(By.cssSelector("input.input")).sendKeys("partixa");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input.input")).sendKeys("12245");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input.button")).click();
		Thread.sleep(1000);
		
		// USING CSS ATTRIBUTE
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mistry");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("2456");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
