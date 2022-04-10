package com.trycloud.stepDefinitions;

import com.trycloud.page.LoginPage;
import com.trycloud.utilities.utilities.ConfigurationReader;
import com.trycloud.utilities.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US1_2 {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page TryCloud")
    public void user_on_the_login_page_try_cloud() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String string, String string2) {
        loginPage.userInput.sendKeys(string);
        loginPage.passwordInput.sendKeys(string2);
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.submitFormInput.click();

    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Trycloud"));
    }


    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String arg0, String arg1) {
        loginPage.userInput.sendKeys(arg0);
        loginPage.passwordInput.sendKeys(arg1);

    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String arg0) {
        Assert.assertEquals(arg0,loginPage.warningMessage.getText());
    }



}
