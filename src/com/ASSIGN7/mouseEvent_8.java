package com.ASSIGN7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseEvent_8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		
		WebElement wid =driver.findElement(By.linkText("Widgets"));
		
		
		
		// Actions is a class, choose "openqa.selenium"
		Actions actions =new Actions(driver); // giving mouse control for full driver(full website)
		
		// Action is a interface, choose "openqa.selenium"
		Action a1= actions.moveToElement(wid)
				.build();
		a1.perform(); // it will perform the task
		Thread.sleep(1000);
		
		WebElement acco =driver.findElement(By.linkText("Accordion"));
		WebElement auto =driver.findElement(By.linkText("AutoComplete"));
		WebElement date =driver.findElement(By.linkText("Datepicker"));
		WebElement sli =driver.findElement(By.linkText("Slider"));
		
		Action a2=actions.moveToElement(acco)
				.build();
		a2.perform();
		Thread.sleep(1000);
		
		Action a3=actions.moveToElement(auto)
				.build();
		a3.perform();
		Thread.sleep(1000);
		
		Action a4= actions.moveToElement(date)
				.build();
		a4.perform();
		Thread.sleep(1000);
		
		Action a5=actions.moveToElement(sli)
		.build();
		a5.perform();
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		
		
		driver.close();
		
		
	}

}
