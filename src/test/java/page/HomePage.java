package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class HomePage {

	@FindBy(xpath = "//a[@href='https://app.getomnify.com/welcome/logout']")
	private WebElement logout;

	@FindBy(xpath = "//span[contains(.,'New')]")
	private WebElement ServicePage;

	@FindBy(xpath = "//div[@class='business-profile__member-img overflow-hidden']")
	private WebElement LogoutOpt;

	// div[text()='Logout']
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickOnService() {
		ServicePage.click();
	}

	public void ClickOnLogoutOpt() {
		LogoutOpt.click();
	}

	public void ClickOnLogout() {
		logout.click();
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
}
