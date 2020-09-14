package lib;

import org.openqa.selenium.WebDriver;

import Pages.Files_Page;
import Pages.Login_Page;
import Pages.Settings_Page;

public class PageLib {
	private WebDriver driver;
	private Settings_Page settingsPage;
	private Login_Page loginPage;
	private Files_Page filesPage;
	
	public PageLib(WebDriver driver) {
	
		this.driver = driver;
		settingsPage = new Settings_Page(this.driver);
		loginPage = new Login_Page(this.driver);
		filesPage = new Files_Page(this.driver);
		
	}
	
	public Settings_Page SettingsPage() {
		return settingsPage;
	}
	
	public Login_Page LoginPage() {
		return loginPage;
	}
	
	public Files_Page FilesPage() {
		return filesPage;
	}

}
