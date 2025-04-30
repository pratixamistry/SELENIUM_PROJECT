package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Delay {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/javascript-delays/");
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,12);
		driver.findElement(By.id("start")).click();
	
//		String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delay"))).getText();
//		System.out.println("message is: "+msg);
	
		WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delay")));
		//Thread.sleep(2000);
		System.out.println("msg: "+msg.getText());
		//driver.close();
	}

}
