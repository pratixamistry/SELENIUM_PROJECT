package com.webdriver;
// when we have to use keys like shift, clrt, alt

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Event {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(1000);
	
	WebElement email =driver.findElement(By.id("email"));
	
	Actions actions=new Actions(driver);
	
	Action a1=actions.moveToElement(email)
			.click()
			.keyDown(email,Keys.SHIFT)
			.sendKeys("pratixa")
			.keyUp(email,Keys.SHIFT)
			.build();
	
	
	a1.perform();
	
	driver.close();
}
}
