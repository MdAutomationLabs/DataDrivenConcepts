package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
  
	
static Xls_Reader reader; // xls reader class come form excel utility package's reader class
	
	public static ArrayList<Object[]> getDataFromExcel(){

			ArrayList<Object[]> myData = new ArrayList<Object[]>();
			
			try {
				reader = new Xls_Reader("C:\\Users\\Md Ahmed\\eclipse-workspace\\TestNgMaven\\src\\main\\java\\com\\test\\data\\HalfEbayTestData.xlsx");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
				
					String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
					String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
					String address1 = reader.getCellData("RegTestData", "address1", rowNum);
					String address2 = reader.getCellData("RegTestData", "address2", rowNum);
					String city = reader.getCellData("RegTestData", "city", rowNum);
					String state = reader.getCellData("RegTestData", "state", rowNum);
					String zipCode = reader.getCellData("RegTestData", "zipcode", rowNum);
					String emailAddress = reader.getCellData("RegTestData", "emailaddress", rowNum);
                // store all the value in the object array which are pulled from excel file 
					Object ob[] = {firstName, lastName, address1, address2, city, state, zipCode, emailAddress};
					myData.add(ob);	
			}
			return myData;
		
}
}