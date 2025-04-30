package com.Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinksCheck {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/broken-links/");

        // Find all <a> elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        int brokenCount = 0;

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("⚠️ Empty or missing href.");
                continue;
            }

            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
                connection.setRequestMethod("GET");
                connection.connect();

                int statusCode = connection.getResponseCode();
                if (statusCode >= 400) {
                    System.out.println("❌ Broken Link: " + url + " | Status: " + statusCode);
                    brokenCount++;
                } else {
                    System.out.println("✅ Valid Link: " + url + " | Status: " + statusCode);
                }

            } catch (Exception e) {
                System.out.println("❌ Exception for URL: " + url + " | " + e.getMessage());
                brokenCount++;
            }
        }

        System.out.println("Total broken links: " + brokenCount);

        driver.quit();
    }
}

