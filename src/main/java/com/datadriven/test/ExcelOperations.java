package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {

		//get test data from excel:
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Md Ahmed\\eclipse-workspace\\TestNgMaven\\src\\main\\java\\com\\test\\data\\HalfEbayTestData.xlsx");
		
		// to add a sheet and check the sheet is exist or not and then add
		reader.addSheet("HomePage1");
		if(!reader.isSheetExist("HomePage1")) {
			reader.addSheet("HomePage1");
		}
		// Xls-reader utility file should be created by developer 
		//to read data from excel file by the help of poi api 
		int callCount = reader.getColumnCount("RegTestData");
		System.out.println(callCount);
		System.out.println(reader.getCellRowNum("RegTestData", "firstname", "Tom"));
		System.out.println(reader.getRowCount("RegTestData"));
}
}
