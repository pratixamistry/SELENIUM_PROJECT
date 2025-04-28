package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// to open website
		driver.get("https://sso.teachable.com/secure/1077388/identity/login/otp");
		
//		// USING NAME
//		
//		driver.findElement(By.name("login[username]")).sendKeys("new_user1");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.name("login[password]")).sendKeys("123456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.name("send")).click();
//		Thread.sleep(2000);	
		
		//USING ID
		
		driver.findElement(By.id("email")).sendKeys("new_user2");
		Thread.sleep(1000);
			
		driver.findElement(By.id("otp-login-btn")).click();
		Thread.sleep(2000);
		
		//USING CSS ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("new_user3");
		Thread.sleep(1000);	
				
		driver.findElement(By.cssSelector("button#otp-login-btn")).click();
		Thread.sleep(2000);
	
		// USING CLASS		
		driver.findElement(By.cssSelector("input.XSXtW.x97ZL")).sendKeys("partixa");
		Thread.sleep(1000);
	
		driver.findElement(By.cssSelector("button.Y4agH.mguTu.col-12.uni-mt-16.uni-pv-16.uni-pv-8.uni-ph-32.mzjMa.rJteP.PM45p")).click();
		Thread.sleep(1000);
		
		// USING CSS type
		
		driver.findElement(By.cssSelector("input[data-testid='email-input']")).sendKeys("mistry1");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[data-testid='btn-login']")).click();
		Thread.sleep(2000);
		
		// USIBNG CSS ATTRIBUTE title
		
//		driver.findElement(By.cssSelector("input[title='Email']")).sendKeys("mistry2");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("input[title='Password']")).sendKeys("2456");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(2000);
		
		driver.quit();
	}


}
