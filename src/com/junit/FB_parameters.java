package com.junit;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

@RunWith(Parameterized.class)
public class FB_parameters {
	

		//WebDriver driver;
		FB_Login ad=new FB_Login();;
		String email_id, password;
		
		
		
		
		// constructor 
		public FB_parameters (String email_id, String password) {
			
			this.email_id=email_id;
			this.password=password;
			
		}
			
		
		@Parameterized.Parameters
		public static Collection input() {
			return Arrays.asList(new Object[][]  {{"pratixa","12345677"},{"mistry", "8779874379"},
				{"muscat","7687hjhnj4h"}});
		}
		
		
		@Test
		public void name() throws InterruptedException {
			//System.out.println("My expected no is: "+e_no); // e_no is expected output 
			//Assert.assertEquals(e_no, ad.sum(f_no, s_no)); //ad.sum(f_no, s_no) will give actual optput
		ad.login(email_id,password);
		}
		
}

