package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Gestures_Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://practice-automation.com/gestures/");
	Thread.sleep(1000);
	
	Actions actions = new Actions(driver);
	
	WebElement sourceElement = driver.findElement(By.id("moveMeHeader"));
    WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"post-1023\"]/div/div[2]"));
    actions.dragAndDrop(sourceElement, targetElement).perform();
    Thread.sleep(2000);
    
//    WebElement sourceElement1 = driver.findElement(By.xpath("//*[@id=\\\"post-1023\\\"]/div/div[2]"));
//    WebElement targetElement1 = driver.findElement(By.xpath("//*[@id=\"post-1023\"]/div/p[1]"));
//    actions.dragAndDrop(sourceElement1, targetElement1).perform();
	
    WebElement targetElement1 = driver.findElement(By.xpath("//*[@id=\"post-1023\"]/div/p[1]"));
    WebElement targetElement2 = driver.findElement(By.xpath("//*[@id=\"post-1023\"]/div/div[2]"));
    WebElement targetElement3 = driver.findElement(By.xpath("//*[@id=\"post-1023\"]/div/p[1]"));
    actions.dragAndDrop(sourceElement, targetElement1).perform();
    Thread.sleep(1000);
    actions.dragAndDrop(sourceElement, targetElement2).perform();
    Thread.sleep(1000);
    actions.dragAndDrop(sourceElement, targetElement3).perform();
	
}
}
