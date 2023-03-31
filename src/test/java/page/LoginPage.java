package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {

	
	@FindBy(xpath="//div[text()='LOG IN']")
	private WebElement LogIN;
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogin()
	{
		LogIN.click();
	}
	
	

	}

