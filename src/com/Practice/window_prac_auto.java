package com.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class window_prac_auto {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	// to open website
	driver.get("https://practice-automation.com/window-operations/");
	Thread.sleep(1000);
	
	String main_w = driver.getWindowHandle();  // get address of window
	System.out.println("main window: "+ main_w);
	
//	/////////NEW TAB
	driver.findElement(By.xpath("//*[@id=\"post-1147\"]/div/p[3]/button/b")).click();
	Thread.sleep(1000);
	
	Set<String> all_w =driver.getWindowHandles(); //get all window address
	
	Iterator<String> i1=all_w.iterator();
	
	while (i1.hasNext()) {
		String child_w = (String) i1.next();
		System.out.println(child_w);
		if (!main_w.equals(child_w)) {
			driver.switchTo().window(child_w);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"post-18533\"]/div/div[1]/div[1]/a/picture/img")).click();
			Thread.sleep(3000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.close(); 
			
		}
		
	}
	Thread.sleep(3000);
	driver.switchTo().window(main_w); // bring back cursor to main window
	
	///////REPLACE WINDOW
		driver.findElement(By.xpath("//*[@id=\"post-1147\"]/div/p[5]/button/b")).click();
		Thread.sleep(4000);
		
		
				driver.findElement(By.xpath("//*[@id=\"post-18533\"]/div/div[2]/div[3]/a/img")).click();
				Thread.sleep(3000);
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				driver.navigate().forward();
				Thread.sleep(2000); 
					
				driver.navigate().back();
				Thread.sleep(2000);
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				driver.switchTo().window(main_w);
	System.out.println("in wgich window: "+main_w);
	Thread.sleep(3000);
	
	
	
	////// NEW WINDOW
	driver.findElement(By.xpath("//*[@id=\"post-1147\"]/div/p[7]/button/b")).click();
	Thread.sleep(2000);
	
	Set<String> all_w2 =driver.getWindowHandles(); //get all window address
	
	Iterator<String> i2=all_w2.iterator();
	
	while (i2.hasNext()) {
		String child_w = (String) i2.next();
		System.out.println(child_w);
		if (!main_w.equals(child_w)) {
			driver.switchTo().window(child_w);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"post-18533\"]/div/div[1]/div[3]/a/picture/img")).click();
			Thread.sleep(3000);
			
			
			
			driver.close(); 
			
		}
		
	}
	driver.switchTo().window(main_w);
	
	//driver.close();
}
}
