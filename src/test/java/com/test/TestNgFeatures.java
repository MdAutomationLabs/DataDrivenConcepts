package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	
	@Test
	public void loginTest() { 
		System.out.println();
		//int i = 9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() { 
		System.out.println();
	}
	@Test (dependsOnMethods = "loginTest")
	public void searchPageTest() { 
		System.out.println();
	}
	@Test (dependsOnMethods = "loginTest")
	public void RegistrationPageTest() { 
		System.out.println();
	}

}
