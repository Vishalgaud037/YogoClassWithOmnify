package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AdminnLogin {

	@FindBy(xpath = "//p[text()='Continue with Google']")
	private WebElement clickEmail;

	@FindBy(id = "identifierId")
	private WebElement enterEmail;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement clickNext;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement enterPass;

	@FindBy(xpath = "//a[@href='https://app.getomnify.com/welcome/logout']")
	private WebElement logout;

	public AdminnLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnEmail() {
		clickEmail.click();
	}

	public void enterEmailId(String un) {
		enterEmail.sendKeys(un);
	}

	public void ClickOnNextBTN() {
		clickNext.click();
	}

	public void EnterPassword(String pwd) {
		enterPass.sendKeys(pwd);
	}

	public boolean verifyHomeIsDisplayed(WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOf(logout));
			Reporter.log("logout link is displayed", true);
		} catch (Exception e) {
			Reporter.log("Logout link is not displayed", true);
		}
		return false;
	}

	public boolean verifyLoginPageIsDisplayed(WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOf(clickEmail));
			Reporter.log("logout link is displayed", true);
		} catch (Exception e) {
			Reporter.log("Logout link is not displayed", true);
		}
		return false;

	}
}
