package com.retryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	
	// this is used to run failed test cases individually in test level
	//(retryAnalyzer = com.retryLogic.RetryAnalyzer.class)
	
	@Test
	public void Test1() {
		Assert.assertEquals(true, false);
	}
	
	@Test 
	public void Test2() {
		Assert.assertEquals(true, true);
	}

}
