package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Utility;
import page.AdminnLogin;
import page.HomePage;

public class AdminLogin extends BaseTest {
	@Test
	public void RunAdminLoginPage() throws EncryptedDocumentException, FileNotFoundException, IOException {

		String un = Utility.getData(testData, "Sheet1", 1, 0);
		String pwd = Utility.getData(testData, "Sheet1", 1, 1);

		AdminnLogin login = new AdminnLogin(driver);
		// click on email id
		login.clickOnEmail();
		// enter email id
		login.enterEmailId(un);
		// enter next button
		login.ClickOnNextBTN();
		// enter the password
		login.EnterPassword(pwd);

		// verify that homepage is displayed or not
		HomePage hPage = new HomePage(driver);
		boolean result = hPage.verifyHomeIsDisplayed(wait);

		// get the title
		String title = driver.getTitle();
		Reporter.log("TITLE :" + title, true);
	}
}