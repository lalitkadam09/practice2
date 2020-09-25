package utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports {
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("extentReprt.html");
		ExtentReports extent = new ExtentReports();
		
	}
	@BeforeClass
	public void setUp() {
		
		
		
	}
	
	@Test
	public void test1() {
		
	}
	
	@AfterClass
	public void tearDown() {
		
	}
}
