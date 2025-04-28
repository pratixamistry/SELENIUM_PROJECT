package com.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample_19 {
	// DataProvider method that returns a two-dimensional object array
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"user1", "password1"},
            {"user2", "password2"},
            {"admin", "admin123"}
        };
    }

    // Test method using the DataProvider
    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println("Testing login with Username: " + username + " and Password: " + password);
        // Here you can add assertions and login logic
    }
}
