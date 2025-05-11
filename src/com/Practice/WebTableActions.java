package com.Practice;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class WebTableActions {
    public static void main(String[] args) throws InterruptedException {
        // Update path to chromedriver
System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();

        String targetFirstName = "Alden";
        String targetLastName = "Cantrell";

        try {
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/webtables");
            Thread.sleep(2000);

            // Scroll to the table to avoid ad overlay
            WebElement table = driver.findElement(By.className("ReactTable"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", table);
            Thread.sleep(1000);

            // Find all row groups
            List<WebElement> rows = driver.findElements(By.className("rt-tr-group"));

            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.className("rt-td"));

                if (cells.size() >= 2) {
                    String firstName = cells.get(0).getText().trim();
                    String lastName = cells.get(1).getText().trim();

                    if (firstName.equals(targetFirstName) && lastName.equals(targetLastName)) {

                        // --- Task 1: Click Edit Button ---
                        WebElement editButton = row.findElement(By.cssSelector("span[title='Edit']"));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
                        editButton.click();
                        System.out.println("Edit button clicked for: " + firstName);
                        Thread.sleep(4000); // Pause for observation
                        

//                        WebElement Element1 = driver.findElement(By.id("/html/body/div[4]/div/div/div[1]/button/span[1]")); 
//                		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//
//                		// Scroll into view and align to top
//                		js1.executeScript("arguments[0].scrollIntoView(true);", Element1);
//                		
//                		Thread.sleep(2000);
//
//                		// Then click using JavaScript to avoid interception
//                		js1.executeScript("arguments[0].click();", Element1);

                        
                        driver.findElement(By.id("submit")).click();
                        
                        
                        //driver.findElement(By.id("closeLargeModal")).click();
                        
                        
//                        driver.switchTo().frame("/html/body/div[4]/div"); // give name of iframe
//                		Thread.sleep(2000);
//                		System.out.println(" switched to first iframe is done");
                		
//                		
//                        WebElement closeButton = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button"));
//                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", closeButton);
//                        closeButton.click();
//                        System.out.println("Popup closed.");
//                        Thread.sleep(1000);
                        
                        
                        // --- Task 2: Click Delete Button ---
                        WebElement deleteButton = row.findElement(By.cssSelector("span[title='Delete']"));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteButton);
                        deleteButton.click();
                        System.out.println("Delete button clicked for: " + firstName);
                        break;
                    }
                }
            }

            Thread.sleep(3000); // Pause to observe result
        } finally {
            //driver.quit();
        }
    }
}
