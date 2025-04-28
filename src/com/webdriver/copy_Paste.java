package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyUpAction;

public class copy_Paste {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://careercenter.tops-int.com/");
	Thread.sleep(1000);
	
	WebElement mob_number = driver.findElement(By.id("mobile"));
	WebElement pass = driver.findElement(By.id("password"));
	WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
	Actions actions=new Actions(driver);
	
	//copy mobile number from text box
	 Action a1=actions.moveToElement(mob_number)
			 .click()
			 .sendKeys("9173611918") 	 // writing mob no
			 .doubleClick()	 	// selct mob no
			 .keyDown(mob_number,Keys.CONTROL)		 // press clrt key
			 .sendKeys("c") 	//press c key to copy text
			 .keyUp(mob_number,Keys.CONTROL)	 // release clrt key
			 .build();
	 
	 a1.perform();
	 
	 // paste mob no in password text box
	 Action a2=actions.moveToElement(pass)
			 .click()
			 .keyDown(pass,Keys.CONTROL)
			 .sendKeys("v")		 // paste copied text
			 .keyUp(pass,Keys.CONTROL)
			 .build();
	 
	 a2.perform();
	 
	 Action a3=actions.moveToElement(login)
			 .click()
			 .build();
	 a3.perform();
	 Thread.sleep(1000);
			 
			// 
			 
}
}
