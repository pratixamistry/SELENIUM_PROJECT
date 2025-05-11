package com.FW;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

public class Guru99LoginTest {

    @Test(dataProvider = "loginData")
    public void testLogin(String userId, String password) throws InterruptedException, IOException {
        
    	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.demo.guru99.com/V4/");
            Thread.sleep(1000);

            driver.findElement(By.name("uid")).sendKeys(userId);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("btnLogin")).click();
            Thread.sleep(2000);

            //  Check if alert is present (login failed)
            if (isAlertPresent(driver)) {
                System.out.println(" Login Failed for user id: " + userId);
                takeScreenshot(driver, userId);  // Take screenshot before dismissing alert
                driver.switchTo().alert().accept(); // Close alert
            } else {
                if (driver.getPageSource().contains("Manger Id")) {
                    System.out.println(" Login Passed for user id: " + userId);
                } else {
                    System.out.println(" Login Failed (no alert, unknown reason) for user id: " + userId);
                    takeScreenshot(driver, userId);
                }
            }

        } catch (Exception e) {
            System.out.println(" Exception during login for: " + userId);
            takeScreenshot(driver, userId);
        } finally {
            driver.quit();
        }
    }

    //  Excel DataProvider
    @DataProvider(name = "loginData")
    public Object[][] readLoginData() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\selenium\\Book1.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet4");

        int rowCount = sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount][2];

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            data[i][0] = row.getCell(0).getStringCellValue();
            data[i][1] = row.getCell(1).getStringCellValue();
        }

        workbook.close();
        return data;
    }

    //  Helper to check for alert
    public boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    //  Screenshot method
    public void takeScreenshot(WebDriver driver, String userId) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String safeUserId = userId.replaceAll("[^a-zA-Z0-9]", "_");
        File dest = new File("D:\\selenium\\screenshots\\" + safeUserId + "_" + timestamp + ".png");

        dest.getParentFile().mkdirs(); // Create folder if not exist
        FileHandler.copy(src, dest);
        System.out.println(" Screenshot saved: " + dest.getAbsolutePath());
    }
}
