package script;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Utility;
import page.AdminnLogin;
import page.HomePage;
import page.LoginPage;

public class AdminLoginPage extends BaseTest {
	@Test

	public void RunClass() throws IOException {
		String title = driver.getTitle();
		Reporter.log("Title: "+title,true);


		if(title.equals("Omnify - Login")) {
			Reporter.log("True",true);
		}
		else {
			Reporter.log("false");
			}
}
}