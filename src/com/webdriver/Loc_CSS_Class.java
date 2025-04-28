package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * css class
 * syntax => class_value
 * input.inputtext
 */

public class Loc_CSS_Class {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("partixa@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("12245");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		Thread.sleep(20000);
		
		driver.quit();
		
	}

}
