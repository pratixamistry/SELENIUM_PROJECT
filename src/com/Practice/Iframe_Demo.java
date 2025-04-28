package com.Practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe_Demo {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/iframes/");
		Thread.sleep(2000);
		
		////////////// FRAME 2
		
		
//		driver.switchTo().frame("bottom-iframe");
//		System.out.println("switched to second frame");
//
//		WebElement Element = driver.findElement(By.xpath("//span[text()='Downloads']")); //
//		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
//			js.executeScript("arguments[0].scrollIntoView();",Element);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
//		System.out.println("download has been clicked");
//		
//		driver.switchTo().defaultContent();
		
		//////////////////
		
		
		// FIRST IFRAME
		driver.switchTo().frame("top-iframe"); // give name of iframe
		Thread.sleep(2000);
		System.out.println(" switched to first iframe is done");
		
		//WebElement Element = driver.findElement(By.xpath("//*[@id=\"__docusaurus_skipToContent_fallback\"]/header/div/div/a")); //
	
			driver.findElement(By.xpath("//*[@id=\"__docusaurus\"]/nav/div[1]/div[1]/a[3]")).click();
			System.out.println("api is clicked");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"__docusaurus\"]/nav/div[1]/div[1]/a[1]/b")).click();
			
			WebElement Element = driver.findElement(By.xpath("//a[text()='Get started']")); //
			JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
				js.executeScript("arguments[0].scrollIntoView();",Element);
			

			
		driver.findElement(By.xpath("//a[text()='Get started']")).click();
		System.out.println("target clicked");
		//a[text()='Get started']
	
		driver.switchTo().defaultContent();  // compulsary to switch back to main window
		System.out.println("switched back to main frame");
	}

}
