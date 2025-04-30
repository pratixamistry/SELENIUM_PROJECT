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
		
		
		
		//////////////////////////BY  DRAG AND DROP
		
		// Locate the slider input element (draggable part)
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

        // Get the width of the slider track
        int sliderWidth = slider.getSize().getWidth();
        System.out.println("Slider width: " + sliderWidth);

        // Create Actions object
        Actions actions = new Actions(driver);

        // Drag the slider by offset (e.g., move 75% of its width)
        int moveBy = (int)(sliderWidth * 0.75); // Adjust this for different target values
        actions.clickAndHold(slider).moveByOffset(moveBy, 0).release().perform();

        Thread.sleep(3000); // Observe the change
		
		
		
		//////////////////////////// BY CLICKING
		
//		// Locate the actual slider input element
//        WebElement sliderInput = driver.findElement(By.xpath("//input[@type='range']"));
//
//        // Use JavaScript to set slider value and trigger input event
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(
//            "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));", 
//            sliderInput, "75" // Set value between 0 and 100
//        );
//
//        Thread.sleep(3000); // Observe the result

        //driver.quit();
		
       //////////////////////////////////////////////////////////////////////
        
        

	}

}
