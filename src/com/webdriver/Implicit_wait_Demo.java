package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Implicit_wait_Demo {
	public static void main(String[] args) throws InterruptedException {
		// browser / server setup
				System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
						
				// implicit wait, wait for 5 seconds for all elements to appear before giving error "no such element found"
				// applying to all elements
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
				
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				
				driver.close();
	}
}
