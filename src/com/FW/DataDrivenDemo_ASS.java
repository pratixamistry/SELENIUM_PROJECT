package com.FW;

/*
 * Access details to demo site.
User ID : 	mngr621166
Password : 	abAmusy
This access is valid only for 20 days.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Driver;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DataDrivenDemo_ASS {
	
	// function to read data
	public String[] [] readData() throws Exception {
		String[][] data = null;
		
		// 1. select file path
		String filepath="D:\\selenium\\Book1.xlsx";
		
		//2. to make file or reach to file
		File file =new File(filepath);
		
		//3. to open excel workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//4. to open a sheet,,, take sheet of ss user model		
		Sheet sheet=workbook.getSheet("Sheet4");
		
		//5. to get no of row
		
		int nrow= sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows: " +nrow);
		
		data= new String[nrow][];
		
		for (int i = 0; i < data.length; i++) {
		// 6. to select a row
			
			Row row = sheet.getRow(i);
			
			// 7. to get no of col
			int ncol = row.getPhysicalNumberOfCells();
			System.out.println("no of col: "+ ncol);
			
			data[i]=new String[ncol]; 
			
			for (int j = 0; j < data[i].length; j++) {
				
				
				//8. to select a particular col,, select cell with ss
				Cell cell =row.getCell(j);
				
				//9. to convert every cell value to string
				cell.setCellType(CellType.STRING);
				
				//10. to read data from the cell
				data[i][j]= cell.getStringCellValue(); 
			}
					
		}
		return data;
	}
	
	@Test
	public void test() throws Exception {
		String[][] data=readData();



		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver-win64\\chromedriver.exe");


		
		
		for (int i = 0; i < data.length; i++) {
			

			// open empty browser
						WebDriver driver = new ChromeDriver();
					driver.get("https://www.demo.guru99.com/V4/");
					Thread.sleep(2000);
			

		driver.findElement(By.name("uid"))
		.sendKeys(data[i][0]);
		Thread.sleep(2000);

		driver.findElement(By.name("password"))
		.sendKeys(data[i][1]);
		Thread.sleep(2000);

		driver.findElement(By.name("btnLogin")).click();

		Thread.sleep(2000);
		
		
		
		
		// Check if login failed by checking for alert or presence of manager page
        boolean testPassed = false;
       // try {
            if (driver.getPageSource().contains("Manager Id")) {
                testPassed = true;
                System.out.println("Test Case " + (i+1) + ": PASS");
            } else {
            	// screen shot
            	System.out.println("Test Case " + (i+1) + ": FAIL");
File source_file =((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
    			
    			
    			// to save ss in file
    			File dest_file = new File("D:\\selenium\\Screenshot\\defect"+(i+1)+".png");
    			
    			// to open a destination file
    			 
    				try(FileOutputStream fos = new FileOutputStream(dest_file)){
    					
    				// to read from file
    				byte[] fileContent= Files.readAllBytes(source_file.toPath());
    				fos.write(fileContent);
            }
               // throw new Exception("Login failed");
                
           // }
       // } catch (Exception e) {
            //System.out.println("Test Case " + (i+1) + ": FAIL");
            

		
	}
	}
		

	}
}
