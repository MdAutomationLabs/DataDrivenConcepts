package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	/*
	 *	
    setup system properties for chrome
	launch browser
	login to app
	enter URL
	google title test
	logout form app
	close chrome browser
	Delete all cookies
      */
	@BeforeSuite
	public void setUp() { 
		System.out.println("setup system properties for chrome");	
	}
		
	@BeforeTest
	public void login() { 
		System.out.println("launch browser");
	}
	
	@BeforeClass
	public void launchBrowser() { 
		System.out.println("login to app");
	}
	
	
	// sequence needed for every test 
	//executed along with before and after method in paired
	
	@BeforeMethod
	public void enterURL() { 
			System.out.println("enter URL");
	}
		
	@Test
	public void googleTitleTest() { 
		System.out.println("google title test");
	}
	
	@AfterMethod
	public void logOut() { 
		System.out.println("logout form app");
	}
	// end of specific test 
	
	
	@AfterClass
	public void closeBrowser() { 
		System.out.println("close chrome browser");
	}
	
	@AfterTest
	public void deleteAllCookies() { 
		System.out.println("Delete all cookies");
	}
	
	
	

	
}
