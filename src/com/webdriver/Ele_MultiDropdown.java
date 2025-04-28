package com.webdriver;


/*
 * select by
 * 1. index
 * 2. value
 * 3. visible text
 */
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_MultiDropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://output.jsbin.com/osebed/2");
	
	WebElement e1=driver.findElement(By.id("fruits")); 		//WebElement dataElement type
	Select s1 = new Select(e1);			// select is a class
	 
	s1.selectByIndex(2);
	Thread.sleep(1000);
	
	s1.selectByValue("banana");
	Thread.sleep(1000);
	
	s1.selectByVisibleText("Apple");
	Thread.sleep(1000);
	
	s1.deselectByValue("banana");  // to deselect the chosen option
	Thread.sleep(1000);
	
	driver.quit();
	
}
}
