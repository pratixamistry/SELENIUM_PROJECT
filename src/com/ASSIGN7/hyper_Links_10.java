package com.ASSIGN7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class hyper_Links_10 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	

     try {
         // Open the webpage
         driver.get("https://qavbox.github.io/demo/webtable/");
         Thread.sleep(2000);

         // Find all hyperlinks (anchor tags)
         List<WebElement> links = driver.findElements(By.tagName("a"));

         // Print the total number of links
         System.out.println("Total hyperlinks on the page: " + links.size());

         // Print each hyperlink text and URL
         for (WebElement link : links) {
             System.out.println("Link Text: " + link.getText() + " | URL: " + link.getAttribute("href"));
         }

     } finally {
         // Close the browser
         driver.quit();
     }
 
}
}
