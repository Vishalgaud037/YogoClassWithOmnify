package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Utility;
import page.EndUserHomePage;
import page.LoginPage;

public class TestLogin extends BaseTest {
	@Test

	public void runLogin() throws EncryptedDocumentException, FileNotFoundException, IOException {
		String emailID = Utility.getData(testData, "Sheet1", 1, 0);
		String pwd = Utility.getData(testData, "Sheet1", 1, 1);
		EndUserHomePage epage = new EndUserHomePage(driver);
		// click on login button
		epage.ClickOnLogin();
		// enter the email id
		epage.EnterEmailID(emailID);
		// enter the password
		epage.EnterPassword(pwd);
		// click on login button
		epage.ClickOnLogin();
		boolean result = epage.verifyHomePageIsDisplayed(wait);
		
	}
}
