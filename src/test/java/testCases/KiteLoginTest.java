package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import investmenBanking.pom.KiteHomePage;
import investmenBanking.pom.KiteLoginPage;
import investmenBanking.pom.KitePinPage;

public class KiteLoginTest extends BrowserFactory {

	KiteLoginPage login;
	 KiteHomePage home;
	 KitePinPage pin;
	 
	 @BeforeClass
	 public void Browser() {
		openBrowser();
//		logger.info("open bowser by logger");
	 }
	 @BeforeMethod
	 public void loginKite() throws EncryptedDocumentException, IOException {
		 login =new KiteLoginPage(driver);		 
		 login.setUserName(Utility.getData(0, 0));
		 login.setPassword(Utility.getData(0, 1));
		 login.clickLogin();
		 
		  pin= new KitePinPage(driver);
		 pin.setPin(Utility.getData(0, 2));
		 pin.clickContinue();
		 
//		 logger.info("login Kite");
	 }
	 @Test
	 public void loginTest() {
		  home = new KiteHomePage(driver);
		 String actual=home.getProfileName();
		 String expected ="KV";
	//	 logger.info(actual);
		 Assert.assertEquals(actual, expected, "Profile Name mismatch");
	 }
	 @AfterMethod
	 public void logOutKite(ITestResult result) throws IOException {
		 if (result.getStatus()==ITestResult.FAILURE) {
			 Utility.captureScreenshot(driver);
		 }
///		 logger.info("logout Kite");
	 }
	 @AfterClass
	 public void closeBrowser() {
//		 logger.info("close Kite");
		 driver.close();
		 
	 }
	
}
