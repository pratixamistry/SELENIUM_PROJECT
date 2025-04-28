package com.ASSIGN7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class alert_9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demo.automationtesting.in/Alerts.html ");
				Thread.sleep(2000);
				
				// OPTION 1
				driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
				Thread.sleep(2000);
				
				Alert a1=driver.switchTo().alert();
				System.out.println(a1.getText());
				a1.accept();
				Thread.sleep(2000);
				
				// OPTION 2
				
				
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();// alert will appear after 5 seconds post clicking
				driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
				Thread.sleep(2000);
				
				Alert a2=driver.switchTo().alert();
				System.out.println(a2.getText());
				a2.accept();
				Thread.sleep(2000);
				
				//OPTION 3
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();// alert will appear after 5 seconds post clicking
				driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
				Thread.sleep(2000);
				
				Alert a3=driver.switchTo().alert();
				System.out.println(a3.getText());
				Thread.sleep(2000);
				a3.sendKeys("PRATIXA");
				a3.accept();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();// alert will appear after 5 seconds post clicking
				driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
				Thread.sleep(2000);
				
				System.out.println(a3.getText());
				a3.sendKeys("Your input text");
				Thread.sleep(2000);
				a3.sendKeys("PRATIXA");
				a3.dismiss();
				Thread.sleep(2000);
				
				
				//driver.close();
			}
}
