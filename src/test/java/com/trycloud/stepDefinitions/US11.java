package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import com.trycloud.utilities.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class US11 {
    CommonElementPAge commonElementPAge = new CommonElementPAge();

    @And("user search user from the search box")
    public void userSearchUserFromTheSearchBox() {
        BrowserUtils.waitFor(3);
        BrowserUtils.highlight(commonElementPAge.searchBox);
        commonElementPAge.searchBox.sendKeys("User35"+ Keys.ENTER);
        commonElementPAge.user35.click();
    }


    @And("user write {string}")
    public void userWrite(String arg0) {
        BrowserUtils.highlight(commonElementPAge.messageBoxTalk);
        BrowserUtils.waitForClickablility(commonElementPAge.messageBoxTalk,5);
        commonElementPAge.messageBoxTalk.click();

        commonElementPAge.messageBoxTalk.sendKeys(arg0);
        BrowserUtils.waitForClickablility(commonElementPAge.messageClickButton,5);
    }


    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        commonElementPAge.messageClickButton.click();
    }


    @Then("the user should be able to see {string} is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeIsDisplayedOnTheConversationLog(String arg0) {
        commonElementPAge.verifyMessageTalk(arg0);
    }
}
