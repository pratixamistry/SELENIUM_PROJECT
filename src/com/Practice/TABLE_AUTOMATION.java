package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TABLE_AUTOMATION {
	 public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");

	        WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://practice-automation.com/tables/");
	        Thread.sleep(1000);

	        // Get rows
	        List<WebElement> tr_size = driver.findElements(By.xpath("//*[@id='post-1076']/div/figure/table/tbody/tr"));
	        System.err.println("No. of rows: " + tr_size.size());

	        // Get columns from the first row, 
	        List<WebElement> tc_size = driver.findElements(By.xpath("//*[@id='post-1076']/div/figure/table/tbody/tr[1]/td"));
	        System.out.println("No. of columns: " + tc_size.size());

	        // Loop to print table data
	        for (int i = 1; i <= tr_size.size(); i++) {
	            for (int j = 1; j <= tc_size.size(); j++) {
	                String xpath = String.format("//*[@id='post-1076']/div/figure/table/tbody/tr[%d]/td[%d]", i, j);
	                String data = driver.findElement(By.xpath(xpath)).getText();
	                System.out.print(" | " + data);
	            }
	            System.out.println();
	            Thread.sleep(300);
	        }

	        driver.quit();
	    }
}
