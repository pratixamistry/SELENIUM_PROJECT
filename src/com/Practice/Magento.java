package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Magento {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
		
		// USING NAME
//		
		driver.findElement(By.name("login[username]")).sendKeys("new_user1");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login[password]")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.name("send")).click();
		Thread.sleep(2000);	
		
		//USING ID
		
		driver.findElement(By.id("email")).sendKeys("new_user2");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		
		//USING CSS ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("new_user3");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button#send2")).click();
		Thread.sleep(2000);
	
		// USING CLASS		
//		driver.findElement(By.cssSelector("input.input-text")).sendKeys("partixa");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("input.input-text")).sendKeys("12245");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("button.action.login.primary")).click();
//		Thread.sleep(1000);
		
		// USING CSS type
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("mistry1");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("2456");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}


}
