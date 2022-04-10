package com.trycloud.stepDefinitions;

import com.trycloud.page.CommonElementPAge;
import com.trycloud.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US13 {
    HomePage homePage = new HomePage();
    CommonElementPAge commonElementPAge = new CommonElementPAge();

    @When("the user clicks the contacts module")
    public void theUserClicksTheContactsModule() {
        commonElementPAge.verifyContactList();
    }

}
