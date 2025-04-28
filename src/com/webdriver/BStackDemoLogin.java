package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BStackDemoLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://bstackdemo.com/signin");
		
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"username\"]/div")).click();
	//driver.findElement(By.id("__NEXT_DATA__")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='demouser']")).click();
	Thread.sleep(1500);
	
	driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
	}

}
