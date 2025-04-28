package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class FormAutomation {
    public static void main(String[] args) {
        // Set up ChromeDriver (Update path as per your system)
    	System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

        try {
            // Open the practice form page
            driver.get("https://practice-automation.com/form-fields/");

            // ✅ Using dynamic XPath to find all radio buttons in a group
            List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

            // Select the radio button dynamically (e.g., selecting "Yes" option)
            for (WebElement radio : radioButtons) {
                String value = radio.getAttribute("value"); // Get value attribute
                if (value.equalsIgnoreCase("yes")) {  // Change to desired option
                    radio.click();
                    System.out.println("Selected radio button: " + value);
                    break;
                }
            }

            // ✅ Validation: Verify if the radio button is selected
            WebElement selectedRadio = driver.findElement(By.xpath("//input[@type='radio' and @value='yes']"));
            if (selectedRadio.isSelected()) {
                System.out.println("Radio button selection verified successfully.");
            } else {
                System.out.println("Radio button selection failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after execution
            //driver.quit();
        }
    }
}