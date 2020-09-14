package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {
	WebDriver driver;
	@FindBy(id = "username")
	public WebElement UserElement;

	@FindBy(css = "span[class='ng-tns-c128-0 ng-star-inserted']")
	public WebElement UsernameLabel;

	@FindBy(id = "password")
	public WebElement PassElement;

	@FindBy(css = "span[class='ng-tns-c128-1 ng-star-inserted']")
	public WebElement PasswordLabel;

	@FindBy(id = "login-button")
	public WebElement LoginButton;

	public LoginPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
