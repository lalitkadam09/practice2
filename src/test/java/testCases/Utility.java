package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public  class Utility {
	
	public static String getData (int a, int b) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\User-pc\\eclipse-workspace\\FrameWork\\TestData\\LoginCredentials.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		 String data =sheet.getRow(a).getCell(b).getStringCellValue();
		
		 return data;
	}
	
	public static void captureScreenshot(WebDriver driver) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File ("C:\\Users\\User-pc\\eclipse-workspace\\FrameWork\\Screenshots\\image.jpg");
		 
		 FileHandler.copy(source, dest);
	}

}
