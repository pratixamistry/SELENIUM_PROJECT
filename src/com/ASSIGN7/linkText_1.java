package com.ASSIGN7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class linkText_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Dynamic")).click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
