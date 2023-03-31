package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genric.BaseTest;
import page.EndUserHomePage;

public class EndUserURL extends BaseTest {

	@Test
	public void runLogin() {
		// get the title
		String title = driver.getTitle();
		Reporter.log("Title: " + title, true);

		// verify that title is match or not
		if (title.equals("YogaaclasswithOmnify")) {
			Reporter.log("Pass",true );
		} else {
			Reporter.log("fail",true);
		}
	}
}
