package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageElements.SettingsPageElements;

public class Settings_Page {
	WebDriver driver;
	SettingsPageElements settingsPageElements;
	WebDriverWait wait;

	public Settings_Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		settingsPageElements = new SettingsPageElements(driver);
	}

	public void ClickProvider() {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPageElements.Provider)).click();
	}

	public void ClickProviderECMDropDownOption() {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPageElements.ProviderECMDropDownOption)).click();
	}

	public void ClickApplyButton() {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPageElements.ApplyButton)).click();
	}
}