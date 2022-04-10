package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import com.trycloud.utilities.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US14 {
    CommonElementPAge commonElementPAge = new CommonElementPAge();


    @When("the user Clicks the magnifier icon on the right top")
    public void theUserClicksTheMagnifierIconOnTheRightTop() {
        BrowserUtils.waitForClickablility(commonElementPAge.searchIcon,4);
        commonElementPAge.searchIcon.click();
    }

    @And("User   Search Item {string}")
    public void userSearchItem(String arg0) {
        commonElementPAge.searchInput.sendKeys(arg0+ Keys.ENTER);
        BrowserUtils.waitForVisibility(commonElementPAge.reSearchButton,10);
        commonElementPAge.talkButton.click();
       // BrowserUtils.waitForVisibility(commonElementPAge.talkButton,5);
    }


    @Then("Uerify the app displays the {string} Option")
    public void uerifyTheAppDisplaysTheOption(String arg0) {
        commonElementPAge.verifyFolder(arg0);
    }
}
