package com.herokaup_assign;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_image {
	public static void main(String[] args) {
        // Set up WebDriver path (Update path if necessary)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/broken_images"); // Change this to your target URL

        // Get all images from the webpage
        List<WebElement> images = driver.findElements(By.tagName("img"));

        System.out.println("Total images found: " + images.size());

        // Check each image
        for (WebElement img : images) {
            String imgUrl = img.getAttribute("src");

            if (imgUrl == null || imgUrl.isEmpty()) {
                System.out.println("Image with empty src found.");
                continue;
            }

            try {
                if (isImageBroken(imgUrl)) {
                    System.out.println("Broken Image: " + imgUrl);
                }
            } catch (IOException e) {
                System.out.println("Error checking image: " + imgUrl);
            }
        }

        // Close the browser
        driver.quit();
    }

    // Method to check if the image URL is broken
    public static boolean isImageBroken(String imgUrl) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(imgUrl);
        CloseableHttpResponse response = httpClient.execute(request);

        int statusCode = response.getStatusLine().getStatusCode();
        response.close();
        httpClient.close();

        return (statusCode >= 400); // HTTP 4xx and 5xx are broken
    }
}
