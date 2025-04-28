package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Bstackdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
		
//		// USING NAME
//		
//		driver.findElement(By.name("login[username]")).sendKeys("new_user1");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.name("login[password]")).sendKeys("123456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.name("send")).click();
//		Thread.sleep(2000);	
//		
//		//USING ID
//		
//		driver.findElement(By.id("email")).sendKeys("new_user2");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("pass")).sendKeys("123456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("send2")).click();
//		Thread.sleep(2000);
		
//		//USING CSS ID
//		driver.findElement(By.cssSelector("input#email")).sendKeys("new_user3");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("button#send2")).click();
//		Thread.sleep(2000);
	
		// USING CLASS	 	
		driver.findElement(By.cssSelector("div. css-1wa3eu0-placeholder")).sendKeys("partixa");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div. css-1wa3eu0-placeholder")).sendKeys("12245");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button.Button_root__24MxS Button_slim__2caxo")).click();
		Thread.sleep(1000);
		
//		// USING CSS type
//		
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("mistry1");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("2456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(2000);
		
		// USIBNG CSS ATTRIBUTE title
		
//		driver.findElement(By.cssSelector("input[title='Email']")).sendKeys("mistry2");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("input[title='Password']")).sendKeys("2456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(2000);
		
		driver.quit();
	}

}
