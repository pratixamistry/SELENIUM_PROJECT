package com.ASSIGN7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gmail_4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://workspace.google.com/intl/en-US/gmail/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[5]/a[2]/span")).click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("pratixa.mistry@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section[2]"
				+ "/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("32455666");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/div[3]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
