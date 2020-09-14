package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPageElements {
	WebDriver driver;
	
	@FindBy(id = "adf-provider-selector")
	public WebElement Provider;
	@FindBy(xpath = "//span[contains(text(),'ECM')]")
	public WebElement ProviderECMDropDownOption;
	@FindBy(id = "host-button")
	public WebElement ApplyButton;

	public SettingsPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
