package com.webdriver;
//when website is not launched then have to access from html file use linkText

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocLinkDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("file:///C:\\Users\\Kunal\\eclipse-workspace\\selenium_01_aug\\src\\index1.html");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(1000);
		driver.close();
	}

}

