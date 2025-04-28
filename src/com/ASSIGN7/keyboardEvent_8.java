package com.ASSIGN7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvent_8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/SignIn.html");
			Thread.sleep(1000);
			
			WebElement email = driver.findElement(By.xpath("/html/body/div/div/div[2]/input"));
			WebElement pass = driver.findElement(By.xpath("/html/body/div/div/div[3]/input"));
			WebElement login = driver.findElement(By.id("enterbtn"));
			Actions actions=new Actions(driver);
			
			//copy mobile number from text box
			 Action a1=actions.moveToElement(email)
					 .click()
					 .sendKeys("p@gmail.com") 	 
					 .doubleClick()	 	
					 .keyDown(email,Keys.CONTROL)		 // press clrt key
					 .sendKeys("c") 	//press c key to copy text
					 .keyUp(email,Keys.CONTROL)	 // release clrt key
					 .build();
			 
			 a1.perform();
			 Thread.sleep(2000);			 
			 // paste mob no in password text box
			 Action a2=actions.moveToElement(pass)
					 .click()
					 .keyDown(pass,Keys.CONTROL)
					 .sendKeys("v")		 // paste copied text
					 .keyUp(pass,Keys.CONTROL)
					 .build();
			 
			 a2.perform();
			 Thread.sleep(2000);
			 
			 Action a3=actions.moveToElement(login)
					 .click()
					 .build();
			 a3.perform();
			 Thread.sleep(1000);
			 Thread.sleep(2000);
					 
					driver.close();
					 
		}
}
