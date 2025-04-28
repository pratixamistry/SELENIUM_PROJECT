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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hybrid_Demo_Demo {
	// function to read data
		@DataProvider(name="meer") // giving refrence to file so that function
		//down below can find it 
			public Object[] [] readData() throws InvalidFormatException, IOException {
			Object[][] data = null;
				
				// 1. select file path
				String filepath="D:\\selenium\\Book1.xlsx";
				
				//2. to make file or reach to file
				File file =new File(filepath);
				
				//3. to open excel workbook
				XSSFWorkbook workbook=new XSSFWorkbook(file);
				
				//4. to open a sheet,,, take sheet of ss user model		
				Sheet sheet=workbook.getSheet("Sheet3");
				
				//5. to get no of row
				
				int nrow= sheet.getPhysicalNumberOfRows();
				System.out.println("no of rows: " +nrow);
				
				data= new Object[nrow][];
				
				for (int i = 0; i < data.length; i++) {
				// 6. to select a row
					
					Row row = sheet.getRow(i);
					
					// 7. to get no of col
					int ncol = row.getPhysicalNumberOfCells();
					System.out.println("no of col: "+ ncol);
					
					data[i]=new Object[ncol]; 
					
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
		
		WebDriver driver=null;
		
		@Test(dataProvider ="meer") 
		public void test(String keyword,String data) throws InterruptedException, InvalidFormatException, IOException {
			
		//Object[][] data=readData();
			
			System.setProperty("webdriver.chrome.driver", 
					"D:\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			//for (int i = 0; i < data.length; i++) {
				
			if (keyword.equalsIgnoreCase("open_browser")) {
				driver = new ChromeDriver();
				
			} else if (keyword.equalsIgnoreCase("open_url")) {
				driver.get("https://www.saucedemo.com/");
				Thread.sleep(2000);
			}else if (keyword.equalsIgnoreCase("enter_username")) {
				driver.findElement(By.id("user-name"))
				.sendKeys(data);
				Thread.sleep(2000);
			}else if (keyword.equalsIgnoreCase("enter_password")) {
				driver.findElement(By.id("password"))
				.sendKeys(data);
				Thread.sleep(2000);
			}else if (keyword.equalsIgnoreCase("click_login")) {
				driver.findElement(By.id("login-button")).click();

				Thread.sleep(2000);	
			} else if (keyword.equalsIgnoreCase("close_browser")) {
				driver.close();
			}{

			}	
						
		}
}
