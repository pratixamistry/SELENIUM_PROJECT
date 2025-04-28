package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_SingleDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement e1=driver.findElement(By.name("country")); 		//WebElement dataElement type
		// there is 'tag select' in this kind
		Select s1 = new Select(e1);			// select is a class
		 
		s1.selectByIndex(2);
		Thread.sleep(500);
		
		s1.selectByValue("ANGOLA");
		Thread.sleep(500);
		
		s1.selectByVisibleText("ARGENTINA");
		Thread.sleep(500);
		
		// to go through all the options only method is using the for loop with index
		for (int i = 0; i < 15; i++) {
			s1.selectByIndex(i);
			Thread.sleep(500);
		}
		
		
		for (int i = 50; i < 55; i++) {
			s1.selectByIndex(i);
			Thread.sleep(500);
		}
			
		driver.quit();
	}

}
