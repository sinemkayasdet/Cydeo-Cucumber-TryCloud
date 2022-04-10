package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US9 {
    CommonElementPAge commonElementPAge = new CommonElementPAge();

    @And("user write {string} inside the input box")
    public void userWriteInsideTheInputBox(String arg0) {
        commonElementPAge.commentOption.click();
        commonElementPAge.messageBox.sendKeys(arg0);
    }


    @And("user click the submit button to post it")
    public void userClickTheSubmitButtonToPostIt() {
        commonElementPAge.pushButton.click();

    }


    @Then("Verify {string} is displayed in the comment section.")
    public void verifyIsDisplayedInTheCommentSection(String arg0) {
        commonElementPAge.verifyMesaage(arg0);
    }

}
