package tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Files extends AbstractBaseClass {

	@Test(groups = { "P0" })
	public void PagesOperations() throws Exception {

		App().Flow().navigateToUrl(TestData.filesURL);
		App().Flow().MaximiseBrowser();
				
		if (App().Flow().getCurrentUrl().contains(TestData.fileToLoginRredirectURL)) {

			App().Pages().LoginPage().UserSendKeys(TestData.user);
			App().Pages().LoginPage().PasswordSendKeys(TestData.pass);
			App().Pages().LoginPage().LoginButtonClick();

		} else {

			AssertJUnit.assertEquals("Verify if the Files page URL is displayed", TestData.filesURL,
					App().Flow().getCurrentUrl());
		}

		// 6. Click on 'create new folder' icon.
		App().Pages().FilesPage().CreateNewFolderIconClick();
		
		Thread.sleep(3000);

		// 7. New folder dialog is displayed.
		AssertJUnit.assertTrue("TS7. Verify that the new folder dialog is displayed",
				App().Pages().FilesPage().CreateNewFolderDialogPanelDisplayed());

		// 8.Introduce your Github username (for example in my case) "magemello".
		App().Pages().FilesPage().CreateNewFolderSendKeys(TestData.githubUsername);

		// 9.Name has been added.
		AssertJUnit.assertEquals("TS9. Verify that the name has been added.", TestData.githubUsername,
				App().Pages().FilesPage().NewFolderNameInputContent());

		// 10. Click on 'Create' button.
		App().Pages().FilesPage().CreateNewFolderButtonClick();
		Thread.sleep(1000);

		// 11 The dialog is closed. Folder with your Github username is created in the
		// current folder.
		AssertJUnit.assertFalse("TS11.1 Verify that the new folder dialog is Not displayed",
				App().Pages().FilesPage().CreateNewFolderDialogPanelDisplayed());

		AssertJUnit.assertTrue("TS11.2 Verify if a folder with your Github username is created in the current folder",
				App().Pages().FilesPage().FolderIsCreated(TestData.githubUsername));

		// 12. Click again on 'create new folder' icon.
		App().Pages().FilesPage().CreateNewFolderIconClick();
		
		// 13. New folder dialog is displayed.
		AssertJUnit.assertTrue("TS13. Verify that the new folder dialog is displayed",
				App().Pages().FilesPage().CreateNewFolderDialogPanelDisplayed());

		// 14.Introduce your Github username (for example in my case) "magemello".
		App().Pages().FilesPage().CreateNewFolderSendKeys(TestData.githubUsername);

		// 15.Name has been added.
		AssertJUnit.assertEquals("TS15. Verify that the name has been added.", TestData.githubUsername,
				App().Pages().FilesPage().NewFolderNameInputContent());

		// 16. Click on 'Create' button.
		App().Pages().FilesPage().CreateNewFolderButtonClick();

		// 17. The dialog is not closed (so it's displayed)
		AssertJUnit.assertTrue("TS17. Verify that the new folder dialog is displayed",
				App().Pages().FilesPage().CreateNewFolderDialogPanelDisplayed());

		// 18.The message"There's already a folder with this name. Try a different name" is displayed.
		// AssertJUnit.assertTrue("TS17. Verify that the alert is present",	App().Pages().FilesPage().isAlertPresent();
		
		//Click Cancel Button
		App().Pages().FilesPage().ClickCancelNewFolder();

		// 19. Select the folder with your Github username
		App().Pages().FilesPage().SelectYourFolder(TestData.githubUsername);

		// 20.Open Options window (3 dots)
		App().Pages().FilesPage().ClickTheSelected3DotsCell();

		// 21.Click delete
		App().Pages().FilesPage().ClickDeleteOption();
		sa.assertAll();
	}

}
