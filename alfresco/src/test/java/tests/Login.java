package tests;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
public class Login extends AbstractBaseClass{


	@Test(groups = {"P0"})
	public void LoginWithCorrectCredentials() throws Exception {
				
		App().Flow().navigateToUrl(TestData.loginURL);
		App().Pages().LoginPage().UserSendKeys(TestData.user);
		App().Pages().LoginPage().PasswordSendKeys(TestData.pass);
		App().Pages().LoginPage().LoginButtonClick();
		AssertJUnit.assertNotSame("Verify that the login page is not displayed anymore", TestData.loginURL, App().Flow().getCurrentUrl());
		sa.assertAll();
	}

	@Test(groups = {"P1"})
	public void VerifyFieldsLabels() throws Exception {
		
		App().Flow().navigateToUrl(TestData.loginURL);
		
		AssertJUnit.assertEquals("Verify if loggin page URL is not changed", TestData.loginURL, App().Flow().getCurrentUrl());
		AssertJUnit.assertEquals("Verify the Username displayed label", TestData.usernameDisplayedLabel, App().Pages().LoginPage().UserLabel());
		AssertJUnit.assertEquals("Verify the Password displayed label", TestData.passwordDisplayedLabel, App().Pages().LoginPage().PasswordLabel());
		AssertJUnit.assertEquals("Verify the login button displayed label", TestData.loginButtonLDisplayedLabel, App().Pages().LoginPage().LoginButtonLabel());
		sa.assertAll();
	}
}
