package com.Practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPath_practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				
		// X PATH DEMO
		driver.get("https://the-internet.herokuapp.com/"); // link of website
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[4]/a")).click();  // xpath broken images
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[8]/a")).click(); // xpath login
		Thread.sleep(1000);
		
		
		// LINK DEMO
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Context Menu")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
