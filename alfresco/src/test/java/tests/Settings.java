package tests;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Settings extends AbstractBaseClass{
	
	@Test(groups = {"P0"})
	public void ChangeProvider() throws Exception {
		
		App().Flow().navigateToUrl(TestData.settingURL);
		
		AssertJUnit.assertEquals( "Verify if Settings page URL is not changed", TestData.settingURL, App().Flow().getCurrentUrl());
		App().Pages().SettingsPage().ClickProvider();
		App().Pages().SettingsPage().ClickProviderECMDropDownOption();
		App().Pages().SettingsPage().ClickApplyButton();
		Thread.sleep(1000);
		AssertJUnit.assertEquals( "Verify if Login URL is displayed", TestData.loginURL, App().Flow().getCurrentUrl());
		sa.assertAll();
	}

}
