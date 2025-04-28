package com.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_Practice3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		
		
//		//Option 3
		
		String main_w = driver.getWindowHandle();  // get address of window
		System.out.println("main window: "+ main_w);
		
		//Scrolling down the page till the element is found
		 WebElement Element = driver.findElement(By.id("messageWindowButton")); //
		JavascriptExecutor js = (JavascriptExecutor) driver;  //import option choose
			js.executeScript("arguments[0].scrollIntoView();",Element);

		
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(1000);
		
		Set<String> all_w =driver.getWindowHandles(); //get all window address
		
		Iterator<String> i1=all_w.iterator();
	////	
		while (i1.hasNext()) {
			String child_w = (String) i1.next();
			System.out.println(child_w);
			if (!main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				Thread.sleep(1000);
				

				WebElement web_text = driver.findElement(By.xpath("/html/body"));
				System.out.println(web_text.getText());
				Thread.sleep(2000);
				driver.close(); 
				
			}
			
		}
		
		driver.switchTo().window(main_w); // bring back cursor to main window
		
		
		

		
		System.out.println("in wgich window: "+main_w);
		Thread.sleep(1000);
		
		driver.close();
	}
}
