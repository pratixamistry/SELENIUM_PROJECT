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
		
		
		
		//////////////////
		
		
		// FIRST IFRAME
		driver.switchTo().frame("top-iframe"); // give name of iframe
		Thread.sleep(2000);
		System.out.println(" switched to first iframe is done");
		
		//WebElement Element = driver.findElement(By.xpath("//*[@id=\"__docusaurus_skipToContent_fallback\"]/header/div/div/a")); //
	
			driver.findElement(By.xpath("//*[@id=\"__docusaurus\"]/nav/div[1]/div[1]/a[3]")).click();
			System.out.println("api is clicked");
			Thread.sleep(2000);
			
		driver.switchTo().defaultContent();  // compulsary to switch back to main window
		System.out.println("switched back to main frame");
		
//////////////FRAME 2
		
		
	driver.switchTo().frame("bottom-iframe");
	System.out.println("switched to second frame");

	
	WebElement Element1 = driver.findElement(By.xpath("//span[text()='Downloads']")); 
	JavascriptExecutor js1 = (JavascriptExecutor) driver;

	// Scroll into view and align to top
	js1.executeScript("arguments[0].scrollIntoView(true);", Element1);
	
	Thread.sleep(2000);

	// Then click using JavaScript to avoid interception
	js1.executeScript("arguments[0].click();", Element1);

	System.out.println("download has been clicked");
	
	driver.switchTo().defaultContent();
	
	driver.close();
	}

}
