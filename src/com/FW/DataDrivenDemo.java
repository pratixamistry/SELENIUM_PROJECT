package com.FW;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DataDrivenDemo {
	
	// function to read data
	public String[] [] readData() throws InvalidFormatException, IOException {
		String[][] data = null;
		
		// 1. select file path
		String filepath="D:\\selenium\\Book1.xlsx";
		
		//2. to make file or reach to file
		File file =new File(filepath);
		
		//3. to open excel workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//4. to open a sheet,,, take sheet of ss user model		
		Sheet sheet=workbook.getSheet("Sheet1");
		
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
	public void test() throws InterruptedException, InvalidFormatException, IOException {
		String[][] data=readData();



		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver-win64\\chromedriver.exe");


		for (int i = 0; i < data.length; i++) {
			
			
			// open empty browser
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("user-name"))
		.sendKeys(data[i][0]);
		Thread.sleep(2000);

		driver.findElement(By.id("password"))
		.sendKeys(data[i][1]);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
		driver.close();
	}
	}	

}
