package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Factory;

public class EndUserHomePage {

	// @FindBy(xpath = "//span[contains(.,'New')]")
	// private WebElement ServicePage;

	@FindBy(xpath = "//div[text()='CREATE ACCOUNT']")
	private WebElement CreateAcc;

	@FindBy(xpath = "//div[text()='LOG IN']")
	private WebElement Login;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement GetStarted;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement Logout;

	@FindBy(xpath = "//a[contains(text(),'Forgot your Password?')]")
	private WebElement FgtPass;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement continueBTN;
	
	@FindBy(xpath="//h3[contains(text(),'Forgot Password')]")
	private WebElement ForgotPass;
	
	@FindBy(xpath="//div[text()='Home']")
	private WebElement home;
	
	public EndUserHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Logout() {
		Logout.click();
	}

	public void ClickOnCreateAccount() {
		CreateAcc.click();
	}

	public void EnterEmailID(String emailID) {
		email.sendKeys(emailID);
	}

	public void ClickOnGetStarted() {
		GetStarted.click();
	}

	public void EnterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void ClickOnSubmit() {
		submit.click();
	}

	public void ClickOnForgottPass() {
		FgtPass.click();
	}

	public void ClickOnLogin() {
		Login.click();
	}

	public void clickOnContBTN() {
		continueBTN.click();
	}

	public void ForgotPass() {
		
	}
	public void HomePage() {
		
	}
	
	  public boolean verifyErrMsgIsDisplayed(WebDriverWait wait) { 
		  try {
	  wait.until(ExpectedConditions.visibilityOf(ForgotPass));
	  Reporter.log("logout link is displayed", true); 
	  } catch (Exception e) {
	  Reporter.log("Logout link is not displayed", true);
	  }
	   return false;
	  }
	  public boolean verifyHomePageIsDisplayed(WebDriverWait wait) { 
		  try {
		  wait.until(ExpectedConditions.visibilityOf(home));
		  Reporter.log("logout link is displayed", true); 
		  } catch (Exception e) {
		  Reporter.log("Logout link is not displayed", true);
		  }
		   return false;

}}
