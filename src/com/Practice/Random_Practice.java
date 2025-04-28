package com.Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Random_Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label")).click();
		Thread.sleep(1000);
		
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		Thread.sleep(1000);
	}
}
