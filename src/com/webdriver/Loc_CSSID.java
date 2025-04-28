package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 *1) id => by css id
 * syntax => tagname#id
 * input#email
 * 
 * 2)class
 * 3) attribute
 */

public class Loc_CSSID {
	public static void main(String[] args) throws InterruptedException {
		
		// browser / server setup
				System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
				// open empty browser
				WebDriver driver = new EdgeDriver();
				
				// to open website
				driver.get("https://www.facebook.com/");
				
				// to maximise window
				driver.manage().window().maximize();
				
				driver.findElement(By.cssSelector("input#email")).sendKeys("pratixa@gmail.com");
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("input#pass")).sendKeys("1324");
				Thread.sleep(1000);
				
				driver.findElement(By.name("login")).click();
				Thread.sleep(20000);
				
				driver.quit();
			
		
	}

}
