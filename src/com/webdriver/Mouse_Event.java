package com.webdriver;
//  to move mouse to specific element on website 

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);
		
		WebElement home =driver.findElement(By.linkText("Home"));
		WebElement flight =driver.findElement(By.linkText("Flights"));
		WebElement hotel =driver.findElement(By.linkText("Hotels"));
		WebElement car_rental =driver.findElement(By.linkText("Car Rentals"));
		WebElement cruisElement =driver.findElement(By.linkText("Cruises"));
		WebElement destinationElement=driver.findElement(By.linkText("Destinations"));
		WebElement vacation = driver.findElement(By.linkText("Vacations"));
		
		// Actions is a class, choose "openqa.selenium"
		Actions actions =new Actions(driver); // giving mouse control for full driver(full website)
		
		// Action is a interface, choose "openqa.selenium"
		Action a1= actions.moveToElement(home)
				.build();
		a1.perform(); // it will perform the task
		Thread.sleep(1000);
		
		Action a2=actions.moveToElement(flight)
				.build();
		a2.perform();
		Thread.sleep(1000);
		
		Action a3=actions.moveToElement(hotel)
				.build();
		a3.perform();
		Thread.sleep(1000);
		
		Action a4= actions.moveToElement(car_rental)
				.build();
		a4.perform();
		Thread.sleep(1000);
		
		Action a5=actions.moveToElement(cruisElement)
		.build();
		a5.perform();
		Thread.sleep(1000);
		
		Action a6=actions.moveToElement(destinationElement)
				.build();
		a6.perform();
		Thread.sleep(1000);
		
		Action a7= actions.moveToElement(vacation)
				.build();
		a7.perform();
		Thread.sleep(1000);
		
		
		driver.close();
		
		
	}

}
