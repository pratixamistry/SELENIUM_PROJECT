package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ele_PopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(1000);
		
		String main_w = driver.getWindowHandle();  // get address of window
		System.out.println("main window: "+ main_w);
		
		driver.findElement(By.partialLinkText("Cli")).click();
		Thread.sleep(1000);
		
		Set<String> all_w =driver.getWindowHandles(); //get all window address
		
		Iterator<String> i1=all_w.iterator();
		
		while (i1.hasNext()) {
			String child_w = (String) i1.next();
			System.out.println(child_w);
			if (!main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				Thread.sleep(1000);
				
				driver.findElement(By.name("emailid")).sendKeys("p@gmail.com");
				Thread.sleep(1000);
				
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(1000);
				
				driver.close(); // closes child window
				
			}
			
		}
		
		driver.switchTo().window(main_w); // bring back cursor to main window
		System.out.println("in wgich window: "+main_w);
		Thread.sleep(1000);
		
		driver.close();
		
		
	}

}
