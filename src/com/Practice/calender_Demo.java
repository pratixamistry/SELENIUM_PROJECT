package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class calender_Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	// to open website
	driver.get("https://practice-automation.com/calendars/#contact-form-1065-2");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("//*[@id=\"g1065-2-1-selectorenteradate\"]")).sendKeys("2024-10-10");
	Thread.sleep(1000);
//	// Select Month
//    driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[text()='May']")).click();
//    Thread.sleep(1000);
//    // Select Year
//    driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='1995']")).click();
//    Thread.sleep(1000);
//    // Select Date
//    driver.findElement(By.xpath("//select[@class='ui-state-default']/option[text()=12]")).click();
//    
//    //driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015']")).click();
//    Thread.sleep(1000);
	
	driver.quit();
}
}
