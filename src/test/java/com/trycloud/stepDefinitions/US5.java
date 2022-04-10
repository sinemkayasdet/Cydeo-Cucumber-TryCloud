package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import com.trycloud.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US5 {
    HomePage homePage = new HomePage();
    CommonElementPAge commonElementPAge = new CommonElementPAge();
    String expected;

    @When("the user clicks action-icon  from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
        commonElementPAge.iconButton.click();
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String arg0) {
        commonElementPAge.iconModule(arg0);
    }

    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String arg0) {
        commonElementPAge.sideModule(arg0);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {

        expected = commonElementPAge.firstFavorite.getText();
        Assert.assertFalse("jhdfgd", commonElementPAge.verifyRemovee(expected));
        //Assert.assertEquals(expected, commonElementPAge.list.getText());
    }
}
