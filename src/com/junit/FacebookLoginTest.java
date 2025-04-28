package com.junit;


//import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;


@RunWith(Parameterized.class)
public class FacebookLoginTest {
    private WebDriver driver;
    private FacebookLoginPage loginPage;

    
    public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		loginPage = new FacebookLoginPage(driver);
	}
    
//    @Before
//    public void setUp() {
//        // Setup ChromeDriver
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        // Navigate to Facebook login page
//        driver.get("https://www.facebook.com/");
//
//        // Initialize Page Object
//        loginPage = new FacebookLoginPage(driver);
//    }

    
    
    @Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][]  {{"pratixa@gmail.com","12345677"},{"mistry@gmail.com", "8779874379"},
			{"muscat@gmail.com","7687hjhnj4h"}});
	}
	
    
    
    
//    @Parameterized.Parameters
//    @CsvSource({
//        "validUser@example.com, validPassword",  // Replace with actual test credentials
//        "invalidUser@example.com, wrongPassword",
//        "testuser@gmail.com, test123"
//    })
    public void testLogin(String email, String password) {
        loginPage.login(email, password);

        // Check if login failed (Facebook usually shows a red warning)
        boolean loginFailed = driver.getCurrentUrl().contains("login_attempt");
        assertTrue(loginFailed, "Login should fail for invalid credentials!");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}