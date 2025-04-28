package com.ASSIGN7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogoTest_6 {
	public static void main(String[] args) throws InterruptedException {
        // Set the path for ChromeDriver (Download and update path as needed)
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Implicit wait
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Facebook login page
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        // Locate Facebook logo using XPath
        WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));

        // Verify if the logo is displayed
        if (logo.isDisplayed()) {
            System.out.println("Facebook logo is displayed successfully.");
        } else {
            System.out.println("Facebook logo is NOT displayed.");
        }

        // Close the browser
        driver.quit();
    }
}
