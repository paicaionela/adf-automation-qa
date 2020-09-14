package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import lib.AppLib;

public class AbstractBaseClass {

	WebDriver driver;
	private AppLib app;
	SoftAssert sa;

	@Parameters({ "browser"})
	@BeforeMethod(alwaysRun = true)
	public void setUp(@Optional("Chrome") String browser) throws Exception {
		
		switch (browser) 
		{
			case "Chrome": {
				System.setProperty("webdriver.chrome.driver", TestData.driversLocation + "chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
			case "Firefox": {
				System.setProperty("webdriver.gecko.driver", TestData.driversLocation + "geckodriver.exe");
				driver = new FirefoxDriver();
				break;			
			}
			case "IE": {
				System.setProperty("webdriver.ie.driver", TestData.driversLocation + "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;			
			}
		
		}
		
		sa = new SoftAssert();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		app = new AppLib(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}

	public AppLib App() {
		return app;

	}

}
