package investmenBanking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath="//span[text()='KV']")
	private WebElement profileName;
	
	public KiteHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String getProfileName() {
		String pName =profileName.getText();
		
		return pName;
	}

}
