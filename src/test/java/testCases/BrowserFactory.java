package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
		public static WebDriver driver;
		public static Logger logger;
		
	public static void openBrowser() {
		ChromeOptions notifications =new ChromeOptions();
		notifications.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User-pc\\eclipse-workspace\\FrameWrok\\BrowserDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
	//	Reporter.log("open browser", true);
		
//		 logger =Logger.getLogger("KiteLogger");
//		PropertyConfigurator.configure("log4j2.properties");
	}
}
