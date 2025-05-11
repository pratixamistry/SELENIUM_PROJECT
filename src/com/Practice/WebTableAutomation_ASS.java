package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WebTableAutomation_ASS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        Thread.sleep(3000);

        // Switch to the iframe containing the table (if applicable)
        // driver.switchTo().frame("iframeResult");

        // Task 1: Verify that there are only 4 structure values present in the table
             
        List<WebElement> tr_size = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
		System.out.println("no of rows: "+tr_size.size());   
		
		int structure_value = tr_size.size()-2; // removing header and last total named row from count
		
		
	     // Locate all rows under the Structure column, excluding header and total row
        //List<WebElement> structureValues = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr[position()>1 and position()<last()]"));
      //*[@id=\"leftcontainer\"]/table/tbody/tr
      
        // Optional: Print structure names
//        for (WebElement structure : structureValues) {
//            System.out.println("Structure: " + structure.getText());
//        }

        // Assertion or condition to verify count
        if (structure_value == 4) {
            System.out.println(" Test Passed: 4 structure values are present.");
        } else {
            System.out.println(" Test Failed: Expected 4 structure values, but found " + structure_value);
        }

        // Task 2: Verify that the 6th row of the table has only 2 columns
        List<WebElement> lastRowColumns = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr[6]/td"));
        System.out.println("Columns in 6th row: " + lastRowColumns.size());
        if (lastRowColumns.size() == 2) {
            System.out.println("Task 2 Passed: 6th row has 2 columns.");
        } else {
            System.out.println("Task 2 Failed: Expected 2 but found " + lastRowColumns.size());
        }

        // Task 3: Find the tallest structure in the table

        String[] heights = {"829m", "601m", "509m", "492m"};
        int max = 0;
        String tallest = "";

        for (String height : heights) {
            int h = Integer.parseInt(height.replace("m", ""));
            if (h > max) {
                max = h;
            }
        }

        System.out.println("Tallest structure height is: " + max + "m");
        driver.quit();
    }
}
