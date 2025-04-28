package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_ID {
	public static void main(String[] args) throws InterruptedException {
		// browser / server setup
				System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
				// open empty browser
				WebDriver driver = new EdgeDriver();
				
				// to open website
				driver.get("https://www.saucedemo.com/");
				
				// to maximise window
				driver.manage().window().maximize();
				
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
				
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("react-burger-menu-btn"));
				Thread.sleep(2000);
				
				driver.findElement(By.id("logout_sidebar_link"));
				Thread.sleep(2000);
	
				
				driver.close();
	}

}
