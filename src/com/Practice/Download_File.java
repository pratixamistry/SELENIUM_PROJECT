package com.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Download_File {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://practice-automation.com/file-download/");
		Thread.sleep(1000);
		
		// PDF FILE
		driver.findElement(By.xpath("//*[@id=\"post-1042\"]/div/div[1]/div/div/div/div[3]/a")).click();
		Thread.sleep(2000);
		
		// file 2
		driver.findElement(By.xpath("//*[@id=\"post-1042\"]/div/div[3]/div/div/div/div[3]/a")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("wpdm-lock-frame");
//		
		
		driver.findElement(By.id("password_68127c2757c15_921")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.id("wpdm_submit_68127c2757c15_921")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("Outlined")).click();
		
	}

}
