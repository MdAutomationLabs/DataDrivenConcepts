package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
@Test(invocationTimeOut = 2000)
public void infiniteLoopTest() {
	int i = 1; 
	while (i==1) {
		System.out.println(i);
		i++;
		
	}
}

@Test (expectedExceptions = NumberFormatException.class)
public void testParse() {
	String x= "100A";
	Integer.parseInt(x);
}
}
