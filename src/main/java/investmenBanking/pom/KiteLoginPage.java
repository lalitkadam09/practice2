package investmenBanking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public KiteLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un) {
		userName.sendKeys(un);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		login.click();
	}

}
