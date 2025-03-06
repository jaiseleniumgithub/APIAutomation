package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlisteners implements ITestListener {

	private static final Logger logger = LogManager.getLogger(Testlisteners.class);

	public void onStart(ITestContext context) {
		logger.info("Test Suite Started");
	}

	public void onTestStart(ITestResult result) {
		logger.info("Test exec Started "+ result.getTestName());
		
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test success for "+ result.getMethod().getMethodName());
		logger.info("Test success for "+ result.getMethod().getDescription());
	}

	public void onTestFailure(ITestResult result) {
		logger.error("Test Failed");
	}

	public void onFinish(ITestContext context) {
		logger.info("Test Suite Completed");
	}
}
