package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageElements.FilesPageElements;

public class Files_Page {
	WebDriver driver;
	FilesPageElements filesPageElements;
	WebDriverWait wait;

	public Files_Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		filesPageElements = new FilesPageElements(driver);
	}

	public void CreateNewFolderIconClick() {
		wait.until(ExpectedConditions.elementToBeClickable(filesPageElements.CreateNewFolderIcon)).click();
	}

	public boolean CreateNewFolderDialogPanelDisplayed() {
		try {
			return filesPageElements.CreateNewfolderDialogPanel.isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}

	public void CreateNewFolderSendKeys(String input) {
		wait.until(ExpectedConditions.elementToBeClickable(filesPageElements.CreateNewfolderInput)).sendKeys(input);
	}

	public String NewFolderNameInputContent() {
		return wait.until(ExpectedConditions.elementToBeClickable(filesPageElements.CreateNewfolderInput))
				.getAttribute("value");
	}

	public void CreateNewFolderButtonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(filesPageElements.CreateNewfolderButton)).click();
	}
	public void ClickCancelNewFolder() {
		wait.until(ExpectedConditions.elementToBeClickable(filesPageElements.CancelNewfolder)).click();
	}

	public boolean FolderIsCreated(String input) {
		int index = 0;
		Boolean foundFleg = false;
		for (WebElement row : filesPageElements.Cells) {
			index++;
			if (index == 1) {
				continue;
			}
			if (row.getText().equals(input)) {
				foundFleg = true;
			}

		}
		return foundFleg;
	}

	public String isAlertPresent() {
		try {
			Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
			if (a != null) {
				return driver.switchTo().alert().getText();

			} else {
				throw new Throwable();
			}
		} catch (Throwable e) {
			return "Alert isn't present!!";
		}
	}

	public void SelectYourFolder(String input) {
		int index = 0;		
		for (WebElement row : filesPageElements.Cells) {
			index++;
			if (index == 1) {
				continue;
			}
			if (row.getText().equals(input)) {
				row.click();
			}
		}
	}
	
	public void ClickTheSelected3DotsCell() {
		wait.until(ExpectedConditions.elementToBeClickable(filesPageElements.Selected3DotsCell)).click();
	}
		
	public void ClickDeleteOption() {
		wait.until(ExpectedConditions.elementToBeClickable(filesPageElements.DeleteOption)).click();
	}
	
	
		
	
}
