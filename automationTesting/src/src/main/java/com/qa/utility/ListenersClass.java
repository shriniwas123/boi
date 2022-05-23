package com.qa.utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.TestBase.Testbase;

public class ListenersClass extends Testbase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
   System.out.println("Test Execution Start :-" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution complete :-" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution fail:-" + result.getName());
		CommonMethods.screenShot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	

}
