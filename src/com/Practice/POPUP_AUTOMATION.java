package com.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class POPUP_AUTOMATION {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/popups/");
        Thread.sleep(3000);

        // 1. Handle "Click Me" Alert
        driver.findElement(By.id("alert")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();  // Click OK

        Thread.sleep(3000);

        // 2. Handle "Click Me" Confirm Box
        driver.findElement(By.id("confirm")).click();
        Thread.sleep(1000);
        Alert confirm = driver.switchTo().alert();
        System.out.println("Confirm text: " + confirm.getText());
        confirm.dismiss();  // Click Cancel

        Thread.sleep(3000);

        // 3. Handle "Click Me" Prompt Box
        driver.findElement(By.id("prompt")).click();
        Thread.sleep(1000);
        Alert prompt = driver.switchTo().alert();
        System.out.println("Prompt text: " + prompt.getText());
       
        prompt.sendKeys("Selenium Test");
        Thread.sleep(3000);
        prompt.accept();  // Click OK after entering text

        Thread.sleep(2000);
        driver.quit();
    }
}
