package com.herokaup_assign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_h {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
//		WebElement Element = driver.findElement(By.id("Skills")); //
//		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
//			js.executeScript("arguments[0].scrollIntoView();",Element);
		
		WebElement e1=driver.findElement(By.id("dropdown")); 		//WebElement dataElement type
		// there is 'tag select' in this kind
		Select s1 = new Select(e1);			// select is a class
		 
		s1.selectByIndex(1);
		Thread.sleep(2000);
		
		
		
		s1.selectByVisibleText("Option 2");
		Thread.sleep(2000);
		s1.selectByValue("1");
				Thread.sleep(2000);
		
			
		//driver.quit();
	}
}
