package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LOC_DynamicXpath {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	
Thread.sleep(2000);

// dynamic x path =>		//tagname[@attr_name='attr_value']

driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("1233");
Thread.sleep(2000);

// print text using text()
	String msgString=driver.findElement(By.xpath("//b[text()='Testing']")).getText();
	System.out.println(msgString);
	driver.quit();
	

}
}