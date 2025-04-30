package com.Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenImagesCheck {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/broken-images/");

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total images found: " + images.size());

        int brokenCount = 0;

        for (WebElement img : images) {
            String imgURL = img.getAttribute("src");

            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(imgURL).openConnection());
                connection.setRequestMethod("GET");
                connection.connect();

                int statusCode = connection.getResponseCode();
                if (statusCode != 200) {
                    System.out.println("❌ Broken Image: " + imgURL + " | Status: " + statusCode);
                    brokenCount++;
                } else {
                    System.out.println("✅ Working Image: " + imgURL);
                }

            } catch (Exception e) {
                System.out.println("❌ Exception checking image: " + imgURL + " | " + e.getMessage());
                brokenCount++;
            }
        }

        System.out.println("Total broken images: " + brokenCount);

        driver.quit();
    }
}
