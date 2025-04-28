package com.Practice;

import java.awt.Label;

import javax.swing.text.html.FormSubmitEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Practice_Automation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/form-fields/");
		Thread.sleep(500);
		
		driver.findElement(By.id("name-input")).sendKeys("Pratixa");
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		Thread.sleep(500);
		
		
		for (int i = 1; i < 6; i++) {
			driver.findElement(By.id("drink"+i)).click();
			Thread.sleep(500);
		}
		
		//Scrolling down the page till the element is found
//		 WebElement Element = driver.findElement(By.xpath("//*[@id=\\\"feedbackForm\\\"]/label[10]")); 
//		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
//		js.executeScript("arguments[0].scrollIntoView();",Element);
		
		// MOUSE ACTION FOR COLOR RADIO BUTTON
		
		WebElement red = driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[10]"));
		
		Actions actions =new Actions(driver); 
		
		Action a1= actions.moveToElement(red)
				.click()
				.build();
		a1.perform(); 
		Thread.sleep(1000);
		
		WebElement blue = driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[11]"));
		
		Actions actions1 =new Actions(driver); 
		
		Action a2= actions1.moveToElement(blue)
				.click()
				.build();
		a2.perform(); 
		Thread.sleep(1000);
		
		WebElement yello = driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[12]"));
		
		Actions actions2 =new Actions(driver); 
		
		Action a3= actions2.moveToElement(yello)
				.click()
				.build();
		a3.perform(); 
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[11]")).click();
		
		// drop down
		
//		WebElement Element = driver.findElement(By.id("automation")); 
//		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
//		js.executeScript("arguments[0].scrollIntoView();",Element);
//		
		
			
		driver.findElement(By.id("email")).sendKeys("Pratixa@gmail.com");
		Thread.sleep(500);
		
		// drop down
		driver.findElement(By.id("automation")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("option[data-testid='automation-undecided']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("option[data-testid='automation-yes']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("option[data-testid='automation-no']")).click();
		Thread.sleep(1000);
		
		// automation tools is a broken link
		
		driver.findElement(By.id("message")).sendKeys("Hi there. I am Pratixa");
		Thread.sleep(500);
		
		WebElement Element = driver.findElement(By.id("submit-btn")); 
		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
		js.executeScript("arguments[0].scrollIntoView();",Element);
		
//		driver.findElement(By.id("submit-btn")).click();
//		Thread.sleep(1000);	
		
		 WebElement Element1 = driver.findElement(By.id("submit-btn")); 
		JavascriptExecutor js1 = (JavascriptExecutor) driver;  //import option choose
			js1.executeScript("arguments[0].scrollIntoView();",Element1);
			
		
		driver.findElement(By.id("submit-btn")).click();
		Thread.sleep(1000);
		System.out.println("submit button has clicked" );
		
		
		Alert a4=driver.switchTo().alert();
		System.out.println(a4.getText());
		a4.accept();
		Thread.sleep(2000);
		
		
		//driver.close();
	}

}
