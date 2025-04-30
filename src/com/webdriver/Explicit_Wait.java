package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		Thread.sleep(3000);
		
		// wait for specified elelement to appear for 20 seconds before giving error
		WebDriverWait wait =new WebDriverWait(driver,20);  
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
		Thread.sleep(3000);
		
		
		// give dynamic xpath always because name of element could be keep changing
		String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))).getText();
		System.out.println("message is: "+msg);
		
	}

}
