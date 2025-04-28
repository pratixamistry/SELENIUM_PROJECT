package com.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Practice {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		// OPTION 1
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(2000);
//		
//		Alert a1=driver.switchTo().alert();
//		System.out.println(a1.getText());
//		a1.accept();
//		Thread.sleep(2000);
		
		// OPTION 2
		
		//Scrolling down the page till the element is found
//		 WebElement Element = driver.findElement(By.id("timerAlertButton")); 
//		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
//		js.executeScript("arguments[0].scrollIntoView();",Element);
//		
//		driver.findElement(By.id("timerAlertButton")).click();// alert will appear after 5 seconds post clicking
//		Thread.sleep(6000);
//		
//		Alert a2=driver.switchTo().alert();
//		System.out.println(a2.getText());
//		a2.accept();
//		Thread.sleep(2000);
		
		//OPTION 3
		//Scrolling down the page till the element is found
//		 WebElement Element1 = driver.findElement(By.id("confirmButton")); 
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;  //import option choose
//		js1.executeScript("arguments[0].scrollIntoView();",Element1);
//		
//		driver.findElement(By.id("confirmButton")).click();// alert will appear after 5 seconds post clicking
//		Thread.sleep(2000);
//		
//		Alert a3=driver.switchTo().alert();
//		System.out.println(a3.getText());
//		a3.accept();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("confirmButton")).click();// alert will appear after 5 seconds post clicking
//		Thread.sleep(2000);
//		
//		Alert a4=driver.switchTo().alert();
//		System.out.println(a4.getText());
//		a4.dismiss();
//		Thread.sleep(2000);
		
		//OPRTION 4
		WebElement Element2 = driver.findElement(By.id("promtButton")); 
		JavascriptExecutor js2 = (JavascriptExecutor) driver;  //import option choose
		js2.executeScript("arguments[0].scrollIntoView();",Element2);
		
		driver.findElement(By.id("promtButton")).click();// alert will appear after 5 seconds post clicking
		Thread.sleep(2000);
		
		Alert a4=driver.switchTo().alert();
		System.out.println(a4.getText());
		a4.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();// alert will appear after 5 seconds post clicking
		Thread.sleep(2000);
		
		Alert a5=driver.switchTo().alert();
		System.out.println(a5.getText());
		a5.dismiss();
		Thread.sleep(2000);
		
		//driver.close();
	}

}
