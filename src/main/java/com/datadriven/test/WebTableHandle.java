package com.datadriven.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class WebTableHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //launch chrome driver
		driver.get("https://www.w3schools.com/html/html_tables.asp"); // enter url
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[2]/td[4]
		//*[@id="customers"]/tbody/tr[2]/td[5]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		String beforeXpath_contact = "//*[@id='customers']/tbody/tr[";
		String afterXpath_contact = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		 // -1 is used to deduct the column name row in size
		System.out.println("Total row count "+(rows.size()-1));
		 int rowCount = rows.size();
		 
		 // reader file object
		  Xls_Reader reader = new  Xls_Reader("C:\\Users\\Md Ahmed\\eclipse-workspace\\TestNgMaven\\src\\main\\java\\com\\test\\data\\HalfEbayTestData.xlsx");
		   reader.addSheet("TableData");
		   if(!reader.isSheetExist("TableData")) {
				reader.addSheet("TableData");
				reader.addColumn("TableData", "CompanyName");
				reader.addColumn("TableData", "ContactName");
		   }
		// added reader column to the sheet
		 
		
		  
		  for(int i=2; i<=rowCount; i++) {
			String actualXpath = beforeXpath+i+afterXpath;
			String companyName = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(companyName);
		
			// entering cell data to the sheet
			reader.setCellData("TableData", "CompanyName", i,companyName);
			
			String actualXpath_contact = beforeXpath_contact+i+afterXpath_contact;
			String contactName =  driver.findElement(By.xpath(actualXpath_contact)).getText();
			System.out.println(contactName);
			
			reader.setCellData("TableData", "ContactName", i,contactName);
		}
		
		driver.quit();

	}

	}
