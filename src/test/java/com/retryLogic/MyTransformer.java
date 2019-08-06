package com.retryLogic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer{
	
 // to listen the failed test cases to try again 
//and run many times as initialized in retryAnalyzer class 
public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	annotation.setRetryAnalyzer(RetryAnalyzer.class);
	
}

}
