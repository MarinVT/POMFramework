package TestCases;

import org.testng.annotations.Test;

import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.RediffMailPage;

public class MailTest {

	@Test
	public void writeMailTest() {
		LandingPage landingPage = new LandingPage();
		landingPage.openBrowser();
		
		LoginPage loginPage = landingPage.clickSignIn();
		RediffMailPage rediffMailPage = loginPage.doLogin();
	}
}
