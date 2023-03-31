package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Utility;
import page.EndUserHomePage;
import page.LoginPage;

public class TestInvalidLogin extends BaseTest {

	@Test
	public void RunByInvalidData() throws IOException {
		String emailID = Utility.getData(testData, "Sheet1", 2, 0);
		String pwd = Utility.getData(testData, "Sheet1", 2, 1);
		EndUserHomePage epage = new EndUserHomePage(driver);
		// click on login button
		epage.ClickOnLogin();
		// enter the email id
		epage.EnterEmailID(emailID);
		// enter the password
		epage.EnterPassword(pwd);
		// click on login button
		epage.ClickOnLogin();

	}

}
