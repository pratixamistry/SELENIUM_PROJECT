package com.webdriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SCreen_Shot {
	public static void main(String[] args) throws InterruptedException, Exception, IOException {
		// browser / server setup
				System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
				// open empty browser
				WebDriver driver = new EdgeDriver();
				
				// to open website
				driver.get("https://www.saucedemo.com/");
				
				// to maximise window
				driver.manage().window().maximize();
				
				driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
				Thread.sleep(2000);
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
				
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				
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
				driver.close();
	}

}
