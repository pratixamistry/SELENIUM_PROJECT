package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HOVER_AUTOMATION {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/hover/");
		Thread.sleep(1000);
		
		WebElement mouse_over =driver.findElement(By.id("mouse_over"));
		
		
		// Actions is a class, choose "openqa.selenium"
		Actions actions =new Actions(driver); // giving mouse control for full driver(full website)
		
		// Action is a interface, choose "openqa.selenium"
		Action a1= actions.moveToElement(mouse_over)
				.build();
		a1.perform(); // it will perform the task
		Thread.sleep(2000);
		System.out.println(mouse_over.getText());
		
		
		driver.close();
		
		
	}


}
