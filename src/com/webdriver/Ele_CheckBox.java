package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ele_CheckBox {
	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demo.guru99.com/test/radio.html");
				
				// id of all check boxes are equal only last digit is increasing 
				//in order so rather than coding multiple time use loop
				
				// loop for check box, many check boxes can be selected at a time
				for (int i = 0; i < 3; i++) {
					driver.findElement(By.id("vfb-6-"+i)).click();
					Thread.sleep(1000);
				}
				
				// loop for radio button, only one radio button can be selected at a time
				for (int i = 1; i < 4; i++) {
					driver.findElement(By.id("vfb-7-"+i)).click();
					Thread.sleep(1000);	
				}
			
				driver.close();
	}

}
