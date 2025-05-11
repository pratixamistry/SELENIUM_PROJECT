package com.Practice;

import java.sql.Driver;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DEMOQA {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);
			
		//Student Registration Form
		
		driver.findElement(By.id("firstName")).sendKeys("Pratixa");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Mistry");
		Thread.sleep(1000);
		
		driver.findElement(By.id("userEmail")).sendKeys("pratixa@gmail.com");
		Thread.sleep(2000);
		
		//RADIO BUTTON
		//Scrolling down the page till the element is found
		 WebElement Element = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")); 
		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
		js.executeScript("arguments[0].scrollIntoView();",Element);
		
				driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")).click();
				Thread.sleep(1000);
				
		driver.findElement(By.id("userNumber")).sendKeys("123456789");
		Thread.sleep(1000);
		
		// BIRTHDATE
		// Locate the date input field (change the selector as per your webpage)
        
        
//        // Enter birthdate in yyyy-MM-dd format (Modify format if needed)
//        LocalDate birthdate = LocalDate.of(1899, 5, 19); // Change the birthdate as needed
//        String formattedDate = birthdate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        dateField.clear();
//        dateField.sendKeys(formattedDate);
        
        // BIRTHDAY WITH ANOTHER METHOD
        
//        driver.findElement(By.id("dateOfBirthInput")).click();
//        Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
//        month.selectByVisibleText("May");
//        Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
//        year.selectByVisibleText("1995");
//        driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
        
        
        // THIRD METHOD
		WebElement dateField = driver.findElement(By.id("dateOfBirthInput")); 
        driver.findElement(By.id("dateOfBirthInput")).click();
        Thread.sleep(1000);
        // Select Month
        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[text()='May']")).click();
        Thread.sleep(1000);
        // Select Year
        driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[text()='1995']")).click();
        Thread.sleep(1000);
        // Select Date
        driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015']")).click();
        Thread.sleep(1000);
        
        // SPORTS CHECK BOX
        //driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
      
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
        Thread.sleep(1000);
        
        // UPLOAD A FILE
//       WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
//        uploadElement.sendKeys("C:\\Users\\Kunal\\Desktop\\New folder\\neon-wang-_4ZiLD25hr0-unsplash.jpg");
//        Thread.sleep(1000);
        
        
       
        
        // ADD
		driver.findElement(By.id("currentAddress")).sendKeys("MUSCAT");
		Thread.sleep(2000);
//		
		 // SELECT STATE        
	       driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//div[text()='Haryana']")).click();
	       Thread.sleep(1000);
//	       
//		//SUBJECTS is a bug

	       // CITY
		driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Panipat']")).click();
		Thread.sleep(1000);
		
		// SUBMIT
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
//		
		
		//driver.close();
		
		//driver.findElement(By.cssSelector("lable.custom-control-label")).click();
	
		//RADIO BUTTON
		//WebElement female =driver.findElement(By.cssSelector("lable.custom-control-label"));
		//WebElement female =
				//driver.findElement(By.xpath("//label[text()='Female']")).click();
		
//Actions actions =new Actions(driver); 
//
//		Action a1= actions.moveToElement(female)
//				.click()
//				.build();
//		a1.perform(); 
//		Thread.sleep(500);
		//
		
		
	}

}
