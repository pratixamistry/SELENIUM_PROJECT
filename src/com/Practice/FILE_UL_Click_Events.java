package com.Practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FILE_UL_Click_Events
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/click-events/");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//b[text()='Cat']")).click();
		Thread.sleep(1000);
		
		// Verify the text appears after clicking
        WebElement resultText = driver.findElement(By.xpath("//*[@id=\"demo\"]")); // ID is 'result'
        String actualText = resultText.getText();

        String expectedText = "Meow!";

        if (actualText.equals(expectedText)) {
            System.out.println("✅ Test Passed: Correct text is displayed.");
        } else {
            System.out.println("❌ Test Failed: Expected '" + expectedText + "' but found '" + actualText + "'");
        }
		
		driver.findElement(By.xpath("//b[text()='Dog']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//b[text()='Pig']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//b[text()='Cow']")).click();
		Thread.sleep(1000);
//		
		///////////////////////////
		
		// FILE UPLOAD
		
		driver.get("https://practice-automation.com/file-upload/");
		Thread.sleep(1000);
		
		WebElement uploadElement = driver.findElement(By.id("file-upload"));
        
        // ✅ Replace this with your actual path
        uploadElement.sendKeys("C:\\Users\\Kunal\\Desktop\\LINK.txt");
        
        driver.findElement(By.id("upload-btn")).click();

        Thread.sleep(2000);
        driver.quit();
		
	}

}
