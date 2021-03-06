package com.crm.util;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.config.BrowserDriver;

public class BaseListener extends TestListenerAdapter {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("Reports//crm-test-result.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Host Name", "Chaitu");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "chaichilukuri");

		htmlReporter.config().setDocumentTitle("Crm Automation Testing Report");
		htmlReporter.config().setReportName("My Own Report");
		htmlReporter.config().setTheme(Theme.DARK);
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			BrowserDriver.takeScreenshot();
			htmlReporter.config().setAutoCreateRelativePathMedia(true);
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test Case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}