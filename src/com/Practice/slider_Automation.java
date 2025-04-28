package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_Automation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/slider/");
		Thread.sleep(1000);
		
		// Locate the slider element
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slideMe\"]"));
        WebElement sliderTrack = driver.findElement(By.className("range-slider__range"));
        
        // Get slider width
        int sliderWidth = sliderTrack.getSize().getWidth();
        System.out.println("slider width: "+sliderWidth);
        
        // Using Actions class to drag slider (drag-and-drop method)
        Actions actions = new Actions(driver);
        //actions.clickAndHold(slider).moveByOffset(sliderWidth / 4, 0).release().perform();
        actions.clickAndHold(slider).moveByOffset(700, 0).release().perform();
        
        // Wait for value update (optional)
        Thread.sleep(2000);
        
        // Using JavaScript Executor to directly set value (alternative click method)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.left='50%';", slider);
        
        // Wait to observe changes
        Thread.sleep(2000);
	}

}
