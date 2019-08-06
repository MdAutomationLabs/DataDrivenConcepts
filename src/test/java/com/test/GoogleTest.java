package com.test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleTest {
	WebDriver driver;
    
	@BeforeMethod
	public void setUp() { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		  driver = new ChromeDriver(); //launch chrome driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
  
	}
		
	@Test(priority=3, groups = "title")
	public void googleTitleTest() { 
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1, groups = "logo")
	public void googleLogoTest() { 
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println("Is logo dispayed "+b);
	}
	
	@Test(priority=2, groups = "link")
	public void mailLinkTest() { 
		boolean c = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("Is gmail link displayed "+c);
	}
	
	@AfterMethod
	public void tearDown() { 
		driver.quit();
	}
}
