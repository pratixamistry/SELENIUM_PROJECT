package com.webdriver;

// when any locator is not found use xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loc_Static_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				
		// for another website
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/"); // link of website
		Thread.sleep(1000);
		
		// open inspect first, right click on it , copy xpath / full xpath  
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();  // xpath
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click(); // full xpath
		Thread.sleep(1000);
		driver.close();
	}

}
