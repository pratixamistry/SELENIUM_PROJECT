package com.junit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
    private WebDriver driver;
    
    // Locators for login elements
    private By emailField =By.cssSelector("input#email");
    private By passwordField = By.cssSelector("input#pass");
    private By loginButton = By.name("login");

    // Constructor
    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Login method
    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
