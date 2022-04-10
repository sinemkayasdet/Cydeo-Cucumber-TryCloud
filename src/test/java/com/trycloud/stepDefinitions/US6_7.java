package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import com.trycloud.page.HomePage;
import com.trycloud.page.LoginPage;
import com.trycloud.utilities.utilities.BrowserUtils;
import com.trycloud.utilities.utilities.ConfigurationReader;
import com.trycloud.utilities.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US6_7 {
    CommonElementPAge commonElementPAge = new CommonElementPAge();
    String expected;

    @When("the users click action-icon from any file on the page to remove")
    public void theUsersClickActionIconFromAnyFileOnThePageToRemove() {
        BrowserUtils.waitFor(3);
        commonElementPAge.iconButton.click();
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verifyThatTheFileIsRemovedFromTheFavoritesSubModuleSTable() {
       // BrowserUtils.highlight(commonElementPAge.removeFavorites);
        commonElementPAge.removeFavorites.click();
        //BrowserUtils.waitFor(3);
        expected = commonElementPAge.favoriteList.get(0).getText();
        Assert.assertFalse( "jnkjnm",commonElementPAge.verifyRemovee(expected));
    }

    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        BrowserUtils.waitFor(3);

        commonElementPAge.addIcon.click();

    }


    @And("users uploads file with the “upload file” option")
    public void usersUploadsFileWithTheUploadFileOption() {
        String file = "C:\\Users\\sinem\\Downloads\\Java_Interview_Questions_ALL.docx";
        BrowserUtils.highlight(commonElementPAge.uploadFile);
        commonElementPAge.uploadFile.sendKeys(file);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitForPageToLoad(5);
    }


    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        String expected = "Java_Interview_Questions_ALL";
        //BrowserUtils.highlight(removesFilePage.uploadedFileLocation);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(commonElementPAge.verifyRemovee(expected));
    }


    @And("user clicks the add icon on the top")
    public void userClicksTheAddIconOnTheTop() {

        BrowserUtils.waitFor(5);
        commonElementPAge.addIcon.click();
    }


    @And("user click \"new folder”")
    public void userClickNewFolder()  {
        commonElementPAge.folderName.click();
    }

    @And("user write a {string}")
    public void userWriteA(String string) {
        commonElementPAge.folderNameInputBox.clear();
        commonElementPAge.folderNameInputBox.sendKeys(string);
    }


    @When("the user click submit icon")
    public void theUserClickSubmitIcon() {
        commonElementPAge.iconConfirmButton.click();
    }


    @Then("Verify the folder {string} is displayed on the page")
    public void verifyTheFolderIsDisplayedOnThePage(String string) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(commonElementPAge.verifyRemovee(string));
    }


}