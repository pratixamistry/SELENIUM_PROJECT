package com.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Popup_Ads {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/ads/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"popmake-1272\"]/button")).click();
		
		
		
		
		//driver.close();
	}


}
