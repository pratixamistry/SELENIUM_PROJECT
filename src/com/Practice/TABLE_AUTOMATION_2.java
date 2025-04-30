package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TABLE_AUTOMATION_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/tables/");
		Thread.sleep(1000);
		
		WebElement Element1 = driver.findElement(By.id("dt-length-0")); 
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll into view and align to top
		js.executeScript("arguments[0].scrollIntoView(true);", Element1);
		
		Thread.sleep(2000);

		// Then click using JavaScript to avoid interception
		js.executeScript("arguments[0].click();", Element1);

		// take xpath till th for columns
		
		//  //*[@id="tablepress-1"]/thead/tr/th[1]/span[1]
		
		////*[@id="post-1076"]/div/figure/table/tbody/tr[2]/td[2]
		//    //*[@id="post-1076"]/div/figure/table/tbody/tr[1]/td[1] click on table anywhere to get xpath
		List<WebElement> tc_size = driver.findElements(By.xpath("//*[@id=\"tablepress-1\"]/thead/tr/th"));
		System.out.println("no of colums: "+tc_size.size());
		
		//    //*[@id="tablepress-1"]/tbody/tr[1]/td[2]
		
		// take x path till tr only for rows
		List<WebElement> tr_size = driver.findElements(By.xpath("//*[@id=\"tablepress-1\"]/tbody/tr"));
		System.err.println("no of rows: "+tr_size.size());
		
		for (int i = 1; i <= tr_size.size(); i++) {  // take size of web element
			for (int j = 1; j <=tc_size.size(); j++) {
				String data = driver.findElement(By.xpath("//*[@id=\"tablepress-1\"]/tbody/tr["+i+"]/td["+j+"]"))
						.getText(); //remove after td[1]
				
				System.out.print("  |  "+data);
				
			}
			System.out.println();
			Thread.sleep(500);
		}
	}
}
