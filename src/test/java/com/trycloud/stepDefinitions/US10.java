package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import com.trycloud.utilities.utilities.BrowserUtils;
import com.trycloud.utilities.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US10 {
    CommonElementPAge commonElementPAge = new CommonElementPAge();

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
        commonElementPAge.settingButton.click();
    }

    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {
        commonElementPAge.checkBoxutton.click();
        Assert.assertTrue(commonElementPAge.checkBoxutton.isSelected());
    }

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {
        firstUssage = commonElementPAge.currentStorageUssage.getText();
    }
    String firstUssage,secondUssage;
    @And("user  uploads file with the “upload file“ option")
    public void userUploadsFileWithTheUploadFileOption() {
        String file = "C:\\Users\\sinem\\Downloads\\Java_Interview_Questions_ALL.docx";
        BrowserUtils.highlight(commonElementPAge.uploadFile);
        commonElementPAge.uploadFile.sendKeys(file);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitForPageToLoad(5);
    }
    @And("user refresh the page")
    public void userRefreshThePage() {

        Driver.getDriver().navigate().refresh();
    }


    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {
        secondUssage = commonElementPAge.currentStorageUssage.getText();
        Assert.assertNotEquals(firstUssage,secondUssage);
    }


}
