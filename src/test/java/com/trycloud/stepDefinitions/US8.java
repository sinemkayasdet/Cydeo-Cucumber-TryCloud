package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import com.trycloud.utilities.utilities.BrowserUtils;
import com.trycloud.utilities.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US8 {
    CommonElementPAge commonElementPAge = new CommonElementPAge();
    String expected;

    @And("user click action-icon  from any file on the page")
    public void userClickActionIconFromAnyFileOnThePage() {
        commonElementPAge.iconButton.click();
    }

    @When("user choose the Delete files option")
    public void userChooseTheDeleteFilesOption() {
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(commonElementPAge.deleteFile).click().perform();
    }


    @When("the user clicks the {string} sub-module on the left side")
    public void theUserClicksTheSubModuleOnTheLeftSide(String arg0) {
        commonElementPAge.sideModule(arg0);

    }


    @Then("Verify the deleted file is displayed on the page.")
    public void verifyTheDeletedFileIsDisplayedOnThePage() {
        BrowserUtils.waitFor(3);
        String fileName = CommonElementPAge.getFileNameHolder();
        WebElement element = Driver.getDriver().findElement(By.xpath("(//td//*[.='"+fileName+"'])[1]"));
        BrowserUtils.highlight(element);
        Assert.assertTrue(element.isDisplayed());
    }



}
