package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loc_PartialLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
//		driver.get("file:///C:\\Users\\Kunal\\eclipse-workspace\\selenium_01_aug\\src\\index1.html"); // link of html file
//		Thread.sleep(1000);
//		
//		driver.findElement(By.partialLinkText("Cl")).click(); // no need to give full link name here
		
		// for another website
		driver.get("https://www.geeksforgeeks.org/"); // link of website
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Algo")).click(); // no need to give full link name here
		
		Thread.sleep(1000);
		driver.close();
	}

}
