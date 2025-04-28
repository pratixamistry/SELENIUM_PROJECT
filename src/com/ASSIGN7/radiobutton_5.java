package com.ASSIGN7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class radiobutton_5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		Thread.sleep(1000);
//		
//		for (int i = 0; i < 3; i++) {
//			driver.findElement(By.id("vfb-6-"+i)).click();
//			Thread.sleep(1000);
//		}
//		
//		// loop for radio button, only one radio button can be selected at a time
//		for (int i = 1; i < 4; i++) {
//			driver.findElement(By.id("vfb-7-"+i)).click();
//			Thread.sleep(1000);	
//		}
	
		driver.close();
}
}
