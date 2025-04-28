package com.webdriver;
/*
 * css attribute except id and class everything else is attribute
 * syntax=> tagname[attr_name='att_value']
 * input[type='text']
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loc_CSS_Attribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("pratixa@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("2456");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(20000);
		
		driver.quit();
		
	}

}
