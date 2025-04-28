package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticWeb_table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Kunal\\eclipse-workspace\\selenium_01_aug\\src\\index2.html");
		Thread.sleep(1000);
		
		for (int i = 2; i <=5; i++) {  //starting from data because heading have different x path than data
			for (int j = 1; j <=4; j++) {
				String data =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]"))
						.getText();
				System.out.print("  |  "+data);
			}
			System.out.println();
		}
	}

}
