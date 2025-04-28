package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P_A_Click_Events
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://practice-automation.com/click-events/");
//		Thread.sleep(1000);
		
		//Scrolling down the page till the element is found
//		 WebElement Element = driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[9]")); 
//		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
//		js.executeScript("arguments[0].scrollIntoView();",Element);
		
//		driver.findElement(By.xpath("//b[text()='Cat']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//b[text()='Dog']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//b[text()='Pig']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//b[text()='Cow']")).click();
//		Thread.sleep(1000);
//		
		driver.get("https://practice-automation.com/file-upload/");
		Thread.sleep(1000);
		
		WebElement uploadElement = driver.findElement(By.id("file-upload"));
	      uploadElement.sendKeys("C:\\Users\\Kunal\\eclipse-workspace\\selenium_01_aug\\src\\com\\Practice\\ABC.txt");
	      Thread.sleep(1000);
      
		
		driver.close();
	}

}
