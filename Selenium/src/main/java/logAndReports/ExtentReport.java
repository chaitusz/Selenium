package logAndReports;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public ExtentHtmlReporter extentHtmlReporter;
	
	public ExtentTest extentTest;
	
	public ExtentReports extentReports; 
	
	@BeforeClass
	public void beforeClass() {
		extentHtmlReporter = new ExtentHtmlReporter("extent.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentTest = extentReports.createTest(getClass().getSimpleName());
	}
	
	@Test
	public void testLogin() {
		
		extentTest.log(Status.INFO, "Test1 Started.");
		extentTest.log(Status.INFO, "Test1 Started.");
		
	}
	
	@Test
	public void testLogout() {
		
		extentTest.log(Status.INFO, "Test2 Started.");
		extentTest.log(Status.INFO, "Test2 Started.");
		
	}
	
	@BeforeMethod
	public void beforeMethod(Method result) {
		 	extentTest.log(Status.INFO, result.getName()+" Started...");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		logReport(result);
		
	}
	
	public void logReport(ITestResult result) {
		if(result.getStatus()==result.FAILURE) {
			extentTest.log(Status.ERROR, result.getName()+" Failed");
			extentTest.log(Status.ERROR, result.getThrowable());
		}
		else if(result.getStatus()==result.SKIP) {
			extentTest.log(Status.SKIP, result.getName()+ "Skpped");
			extentTest.log(Status.SKIP, result.getThrowable());
		}
		else if(result.getStatus()==result.SUCCESS) {
			extentTest.log(Status.PASS, result.getName()+ "Passed");
			extentTest.log(Status.PASS, result.getThrowable());	
		}
	}
	
	@AfterClass
	public void afterclass() {
		extentReports.flush();
	}
	
	

}
