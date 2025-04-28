package com.Practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Biba_LinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.biba.com.au/checkout/"); // link of website
		driver.get("https://www.biba.com.au/salons/south-yarra/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-9274\"]/a/span")).click(); // career
		Thread.sleep(1000);
		driver.get("https://www.biba.com.au/salons/south-yarra/");
		driver.findElement(By.xpath("//*[@id=\"menu-item-257\"]/a/span")).click(); // academy
		Thread.sleep(4000);
		
		driver.get("https://www.biba.com.au/salons/south-yarra/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/div/ul/li[6]/a/span")).click(); // gallery full xpath
		Thread.sleep(4000);
		
		driver.get("https://www.biba.com.au/salons/south-yarra/");
		driver.findElement(By.partialLinkText("CAR")).click();
		Thread.sleep(4000);
		
		driver.get("https://www.biba.com.au/salons/south-yarra/");
		driver.findElement(By.partialLinkText("ACA")).click();
		Thread.sleep(4000);
		
	//driver.get("https://www.biba.com.au/checkout/");
//	driver.findElement(By.linkText("Click here to login")).click();
//	Thread.sleep(4000);
	
		
		
		
		
		// USING CLASS		
//				driver.findElement(By.cssSelector("input.input-text")).sendKeys("partixa");
//				Thread.sleep(1000);
//				
//				driver.findElement(By.cssSelector("input.input-text")).sendKeys("12245");
//				Thread.sleep(1000);
//				
//				driver.findElement(By.cssSelector("input.button")).click();
//				Thread.sleep(1000);
//		
//		//USING ID
//		
//				driver.findElement(By.id("username")).sendKeys("new_user2");
//				Thread.sleep(1000);
//				
//				driver.findElement(By.id("password")).sendKeys("123456");
//				Thread.sleep(1000);
//				
//				driver.findElement(By.name("login")).click();
//				Thread.sleep(2000);
//				
//		// USING NAME
////		
//		driver.findElement(By.name("username")).sendKeys("new_user1");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.name("password")).sendKeys("123456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);	
//		
		
		driver.quit();
	
	}

}
