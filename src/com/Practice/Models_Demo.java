package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Models_Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/modals/");
		Thread.sleep(2000);
		// sample modal click on 'X' button
		driver.findElement(By.xpath("//*[@id=\"simpleModal\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"popmake-1318\"]/button")).click();
		Thread.sleep(1000);
		
		// form model
		driver.findElement(By.xpath("//*[@id=\"formModal\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("g1051-name")).sendKeys("Pratixa");
		driver.findElement(By.name("g1051-email")).sendKeys("Pratixa@gmail.com");
		driver.findElement(By.name("g1051-message")).sendKeys("Hi there, I am Pratixa");
		
//		 WebElement Element = driver.findElement(By.xpath("//*[@id=\"contact-form-1051\"]/form/p[1]/button")); //
//			JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
//				js.executeScript("arguments[0].scrollIntoView();",Element);
		
				driver.findElement(By.xpath("//*[@id=\"contact-form-1051\"]/form/p[1]/button")).click();
		
		
		
		driver.close();
	}
}
