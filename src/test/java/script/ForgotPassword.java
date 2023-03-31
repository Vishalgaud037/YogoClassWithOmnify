package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Utility;
import page.EndUserHomePage;
import page.LoginPage;

public class ForgotPassword extends BaseTest {

	@Test
	public void clickFrgtPass() throws EncryptedDocumentException, FileNotFoundException, IOException
{
		String emailID = Utility.getData(testData, "Sheet1", 1, 0);

		EndUserHomePage epage= new EndUserHomePage(driver);
		//click on login button
		epage.ClickOnLogin();
		//enter the email id
		epage.EnterEmailID(emailID);
		//click on continue button
		epage.ClickOnForgottPass();
		
		boolean result=epage.verifyErrMsgIsDisplayed(wait);

}
}
