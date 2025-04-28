package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		Thread.sleep(1000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText()); // to check is it going to alert or not
		//a1.dismiss();    // it will click on cancel button
		a1.accept();   // it will click on OK button
		Thread.sleep(1000);
		
		Alert a2=driver.switchTo().alert();   // for second alert
		System.out.println(a2.getText());
		a2.accept();
		Thread.sleep(1000);
		
		driver.close();
	}

}
