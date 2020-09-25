package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportBasic {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeClass
	public void setUp() {
		htmlReporter =new ExtentHtmlReporter("extentReprt_TestNg.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@Test
	public void test1() throws IOException {
		ExtentTest test =extent.createTest("test of kite login","loginKite");			
		test.log(Status.INFO, "this is to usage of log");
		test.fail("testng failed");
		test.addScreenCaptureFromPath("screenshot.png");
		
	}
	@Test
	public void test2() throws IOException {
		ExtentTest test =extent.createTest("test of kite login","loginKite");			
		test.log(Status.INFO, "this is to usage of log");
		test.pass("passed Test ng");
		test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	
	@AfterClass
	public void tearDown() {
		extent.flush();
	}
	
	
	//		ExtentTest test =extent.createTest("test of kite login","loginKite");
	//		
	//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User-pc\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
	//		WebDriver driver =new ChromeDriver();
	//		
	//		test.log(Status.INFO, "open google");
	//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//		driver.get("https://www.google.com");
	//		
	//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Lalit");
	//		test.log(Status.INFO, "enter text");
	//		
	//		driver.findElement(By.xpath("//input[@name='btnK']")).click();
	//		test.log(Status.INFO, "press click");
	//		
	//		driver.close();
	//		test.log(Status.INFO, "close browser");
	//		
	//		
	//		
	//		extent.flush();
	//		


}
