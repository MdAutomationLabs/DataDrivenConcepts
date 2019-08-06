package com.patameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
	WebDriver driver;

	@Test
	// one to one maping and value will be picked form testng.xlm file 
	@Parameters({"browser", "url", "emailId" })
	public void yahooLoginTest(String browser, String url, String emailId) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
			  driver = new ChromeDriver(); //launch chrome driver
		}else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Md Ahmed\\Documents\\GreckoDriver\\geckodriver.exe");
		       driver = new FirefoxDriver();
		}
		
		driver.get(url);
		
        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailId); // enter
																						// username
		driver.findElement(By.xpath("//*[@id='login-signin']")).click(); // click
																			// on
			driver.quit();																// next
																			// button

	}

}
