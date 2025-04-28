package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class First_demo {
	public static void main(String[] args) throws Exception {
		// browser / server setup
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		// open empty browser
		WebDriver driver = new EdgeDriver();
		
//		// browser / server setup
//				System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
//				// open empty browser
//				WebDriver driver = new ChromeDriver();
	
//		// browser / server setup
//		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
//		
//		// open empty browser
//		WebDriver driver = new FirefoxDriver();
		
		// to open website
		driver.get("https://www.saucedemo.com/");
		
		// to maximise window
		driver.manage().window().maximize();
		
		// to get the current URL
		System.out.println("current URL is: "+ driver.getCurrentUrl());
		
		// to get tab title
		System.out.println("tab title is: "+driver.getTitle());
		
		Thread.sleep(2000);
		//to close website
		driver.close(); // close tab
		
		//to close browser completely
		driver.quit();
		
		
		
	}

}
