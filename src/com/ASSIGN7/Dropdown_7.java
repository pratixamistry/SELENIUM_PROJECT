package com.ASSIGN7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

// 7 W.A.J.Script To write a script for drop down. 

public class Dropdown_7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement Element = driver.findElement(By.id("Skills")); //
		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
			js.executeScript("arguments[0].scrollIntoView();",Element);
		
		WebElement e1=driver.findElement(By.id("Skills")); 		//WebElement dataElement type
		// there is 'tag select' in this kind
		Select s1 = new Select(e1);			// select is a class
		 
		s1.selectByIndex(2);
		Thread.sleep(500);
		
		s1.selectByValue("Adobe Photoshop");
		Thread.sleep(500);
		
		s1.selectByVisibleText("Android");
		Thread.sleep(500);
		
		// to go through all the options only method is using the for loop with index
		for (int i = 0; i < 15; i++) {
			s1.selectByIndex(i);
			Thread.sleep(500);
		}
		
		
		for (int i = 50; i < 21; i++) {
			s1.selectByIndex(i);
			Thread.sleep(2000);
		}
			
		driver.quit();
	}

}
