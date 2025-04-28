package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Prac_Auto_Cala {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://practice-automation.com/calendars/");
		
		
	}

}
