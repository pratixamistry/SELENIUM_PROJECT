package com.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

public class DEMOQA_ASS {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
        System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        
        
        // scoll down to some element otherwise ad is being clicked
        WebElement Element1 = driver.findElement(By.id("firstName")); 
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		// Scroll into view and align to top
		js1.executeScript("arguments[0].scrollIntoView(true);", Element1);
		
		Thread.sleep(2000);
//
//		// Then click using JavaScript to avoid interception
	js1.executeScript("arguments[0].click();", Element1);


        Actions actions = new Actions(driver);

        // First Name field - Mouse event & keyboard event
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        actions.moveToElement(firstNameField).click().sendKeys("Pratixa").perform();
        Thread.sleep(1000);

        // Last Name field - Mouse event & keyboard event
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        actions.moveToElement(lastNameField).click().sendKeys("Mistry").perform();
        Thread.sleep(1000);

        // Email field - Mouse event & keyboard event
        WebElement emailField = driver.findElement(By.id("userEmail"));
        actions.moveToElement(emailField).click().sendKeys("pratixa@gmail.com").perform();
        Thread.sleep(1000);

        // Male radio button - Mouse event
        WebElement maleRadioButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
        actions.moveToElement(maleRadioButton).click().perform();
        Thread.sleep(1000);

        // Sports checkbox - Mouse event
        WebElement sportsCheckbox = driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label"));
        actions.moveToElement(sportsCheckbox).click().perform();
        Thread.sleep(1000);

        // Phone Number - Mouse event & keyboard event
        WebElement phoneField = driver.findElement(By.id("userNumber"));
        actions.moveToElement(phoneField).click().sendKeys("1234567890").perform();
        Thread.sleep(1000);
        
        //driver.findElement(By.xpath("//*[@id=\\\"subjectsContainer\\\"]/div/div[1]")).sendKeys("maths");

        // Birthdate - Mouse event (Month, Year, Date)
        //driver.findElement(By.id("dateOfBirthInput")).sendKeys("12345678");
//        WebElement birthdateField = driver.findElement(By.id("dateOfBirthInput"));
//        actions.moveToElement(birthdateField).click().perform();
//        Thread.sleep(1000);
//        actions.moveToElement(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[text()='May']"))).click().perform();
//        Thread.sleep(1000);
//        actions.moveToElement(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[text()='1995']"))).click().perform();
//        Thread.sleep(1000);
//        actions.moveToElement(driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015']"))).click().perform();
//        Thread.sleep(1000);

        // File upload - Mouse event
WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
//uploadElement.click();
        // ✅ Replace this with your actual path
        uploadElement.sendKeys("C:\\Users\\Kunal\\Desktop\\one.PNG");
        
        //driver.findElement(By.id("upload-btn")).click();

        Thread.sleep(2000);
     // ADD
		driver.findElement(By.id("currentAddress")).sendKeys("MUSCAT");
		Thread.sleep(2000);
//		
//		 // SELECT STATE        
//		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).click();
//	       Thread.sleep(1000);
//	              
//	       driver.findElement(By.xpath("//div[text()='Haryana']")).click();
//	       Thread.sleep(1000);
	       
//		//SUBJECTS is a bug

	       // CITY
//		driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Panipat']")).click();
//		Thread.sleep(1000);
//		
//		// SUBMIT
//		driver.findElement(By.id("submit")).click();
//		Thread.sleep(1000);
//        // Current Address - Keyboard event
//        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
//        actions.moveToElement(currentAddressField).click().sendKeys("1234 Main St, Muscat").perform();
//        Thread.sleep(1000);
//
//        // Select State - Mouse event
        WebElement stateDropdown = driver.findElement(By.xpath("//*[@id='state']/div/div[1]"));
        actions.moveToElement(stateDropdown).click().perform();
        Thread.sleep(1000);
        WebElement haryanaState = driver.findElement(By.xpath("//div[text()='Haryana']"));
        actions.moveToElement(haryanaState).click().perform();
        Thread.sleep(1000);
//
//        // Select City - Mouse event
        WebElement cityDropdown = driver.findElement(By.xpath("//*[@id='stateCity-wrapper']/div[3]"));
        actions.moveToElement(cityDropdown).click().perform();
        Thread.sleep(1000);
        WebElement panipatCity = driver.findElement(By.xpath("//div[text()='Panipat']"));
        actions.moveToElement(panipatCity).click().perform();
        Thread.sleep(1000);
//
//        // Submit form
        WebElement submitButton = driver.findElement(By.id("submit"));
        actions.moveToElement(submitButton).click().perform();
        Thread.sleep(1000);
        
       ////////////////////////////////////// screen shot
		// to create ss
		File source_file =((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		
		
		// to save ss in file
		File dest_file = new File("D:\\selenium\\Screenshot\\defect1.png");
		
		// to open a destination file
		 
			try(FileOutputStream fos = new FileOutputStream(dest_file)){
				
			// to read from file
			byte[] fileContent= Files.readAllBytes(source_file.toPath());
			fos.write(fileContent);
		}

        driver.quit();
    }
}
