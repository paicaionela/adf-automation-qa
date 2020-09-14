package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageElements.LoginPageElements;

public class Login_Page {
	WebDriver driver;
	LoginPageElements loginPageElements;
	WebDriverWait wait;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		loginPageElements = new LoginPageElements(driver);

	}

	public void UserSendKeys(String inputData) {
		wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.UserElement)).sendKeys(inputData);
	}

	public String UserLabel() {
		return wait.until(ExpectedConditions.visibilityOf(loginPageElements.UsernameLabel)).getText();
	}

	public void PasswordSendKeys(String inputData) {
		wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.PassElement)).sendKeys(inputData);
	}

	public String PasswordLabel() {
		return wait.until(ExpectedConditions.visibilityOf(loginPageElements.PasswordLabel)).getText();
	}

	public void LoginButtonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.LoginButton)).click();
	}

	public String LoginButtonLabel() {
		return wait.until(ExpectedConditions.visibilityOf(loginPageElements.LoginButton)).getText();
	}
}
