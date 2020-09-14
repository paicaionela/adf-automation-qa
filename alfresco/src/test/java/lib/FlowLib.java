package lib;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class FlowLib {

	private WebDriver driver;

	public FlowLib(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToUrl(String url) {
		this.driver.get(url);
	}

	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}

	public String getCurrentPageTitle() {
		return this.driver.getTitle();
	}
	public void MaximiseBrowser() {
		 this.driver.manage().window().maximize();
	}	
		
}
