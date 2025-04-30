package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AccordionTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/accordions/");
        Thread.sleep(1000);

        // Click the first accordion button (you can change the XPath for other accordion items)
        WebElement accordionButton = driver.findElement(By.xpath("//*[@id=\"post-1261\"]/div/div[1]/div/details/summary"));
        accordionButton.click();
        Thread.sleep(500);

        // Get the text after the accordion expands
        WebElement expandedText = driver.findElement(By.xpath("//*[@id=\"post-1261\"]/div/div[1]/div/details/div/p"));
        String actualText = expandedText.getText();

        // Expected text
        String expectedText = "This is an accordion item.";

        // Assert the expected text with the actual text
        if (actualText.equals(expectedText)) {
            System.out.println("✅ Test Passed: Correct text is displayed.");
        } else {
            System.out.println("❌ Test Failed: Expected '" + expectedText + "' but found '" + actualText + "'");
        }

        driver.quit();
    }
}
