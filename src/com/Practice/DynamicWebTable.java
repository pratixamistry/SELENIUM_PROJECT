package com.Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicWebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(1000);
		// take xpath till th for columns
		List<WebElement> tc_size = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("no of colums: "+tc_size.size());
		
		// take x path till tr only for rows
		List<WebElement> tr_size = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.err.println("no of rows: "+tr_size.size());
		
		for (int i = 1; i <= tr_size.size(); i++) {  // take size of web element
			for (int j = 1; j <=tc_size.size(); j++) {
				String data = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]"))
						.getText(); //remove after td[1]
				
				System.out.print("  |  "+data);
				
			}
			System.out.println();
			Thread.sleep(500);
		}
	}

}
