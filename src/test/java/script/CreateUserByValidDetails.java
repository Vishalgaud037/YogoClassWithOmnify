package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Utility;
import page.EndUserHomePage;
import page.HomePage;

public class CreateUserByValidDetails extends BaseTest {
	@Test

	public void CreateUser() throws EncryptedDocumentException, FileNotFoundException, IOException {
		String emailID = Utility.getData(testData, "Sheet1", 1, 0);
		String pass=Utility.getData(testData, "Sheet1", 1, 1);

		EndUserHomePage ePage = new EndUserHomePage(driver);
		// click on create account button
		ePage.ClickOnCreateAccount();
		//enter the email address
		ePage.EnterEmailID(emailID);
		// click on get started
		ePage.ClickOnGetStarted();
		//enter the password
		ePage.EnterPassword();
		//click on login button
		ePage.ClickOnSubmit();
		
		//verify homepage is displayed
		HomePage hPage = new HomePage(driver);
		boolean result = hPage.verifyHomeIsDisplayed(wait);

	}

}
