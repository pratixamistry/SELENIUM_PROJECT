package com.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Download_File {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://practice-automation.com/file-download/");
		Thread.sleep(1000);
		
		// PDF FILE
//		driver.findElement(By.xpath("//*[@id=\"post-1042\"]/div/div[1]/div/div/div/div[3]/a")).click();
//		Thread.sleep(2000);
		
		// file 2
		driver.findElement(By.xpath("//*[@id=\"post-1042\"]/div/div[3]/div/div/div/div[3]/a")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("wpdm-lock-frame");
//		driver.findElement(By.xpath("//*[@id=\"password_67a45fcf066df_921\"]")).sendKeys("12345678");
//		Thread.sleep(1000);	Thread.sleep(1000);
		
		
//		String main_w = driver.getWindowHandle();  // get address of window
//		System.out.println("main window: "+ main_w);
//		Set<String> all_w =driver.getWindowHandles(); //get all window address
//		
//		Iterator<String> i1=all_w.iterator();
//		
//		while (i1.hasNext()) {
//			String child_w = (String) i1.next();
//			System.out.println(child_w);
//			if (!main_w.equals(child_w)) {
//				driver.switchTo().window(child_w);
//				System.out.println("switched to child window");
//				driver.findElement(By.xpath("//*[@id=\"password_67a45fcf066df_921\"]")).sendKeys("12345678");
//				Thread.sleep(1000);	Thread.sleep(1000);
//			
//				
//			}
//			
//		}
		
//		Alert a5=driver.switchTo().alert();
//		System.out.println(a5.getText());
//		a5.dismiss();
//		Thread.sleep(2000);
		
		driver.findElement(By.id("password_67c6b02585301_921")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.id("wpdm_submit_67c6b02585301_921")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("Outlined")).click();
		
	}

}
