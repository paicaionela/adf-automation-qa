package PageElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPageElements {
	WebDriver driver;
	
	public FilesPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//mat-icon[contains(text(),\'create_new_folder\')]")
	public WebElement CreateNewFolderIcon;
	
	@FindBy(css = "mat-dialog-container")
	public WebElement CreateNewfolderDialogPanel;
	
	@FindBy(id = "adf-folder-name-input")
	public WebElement CreateNewfolderInput;
	
	@FindBy(id = "adf-folder-create-button")
	public WebElement CreateNewfolderButton;
	
	@FindBy (xpath = "//div[@class=\'adf-full-width adf-datatable-list ng-star-inserted\']//div[@class=\'adf-datatable-body\']/adf-datatable-row/div")
	public List <WebElement> Cells;
	
	@FindBy (xpath = "//adf-datatable-row[@class=\'adf-datatable-row ng-star-inserted adf-is-selected\']//div[@class=\'adf-datatable-cell adf-datatable__actions-cell adf-datatable-center-actions-column-ie ng-star-inserted\']")
	public WebElement Selected3DotsCell;
	
	@FindBy (xpath = "//div[@class='cdk-overlay-container']//button[5]")
	public WebElement DeleteOption;
	
	@FindBy (id = "adf-folder-cancel-button")
	public WebElement CancelNewfolder;
}
