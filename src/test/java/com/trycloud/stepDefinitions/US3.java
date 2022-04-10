package com.trycloud.stepDefinitions;

import com.trycloud.page.HomePage;
import com.trycloud.page.LoginPage;
import com.trycloud.utilities.utilities.ConfigurationReader;
import com.trycloud.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class US3 {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user on the login page")
    public void userOnTheLoginPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the users  log in with valid credentials")
    public void theUsersLogInWithValidCredentials() {
        loginPage.loginBy(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        loginPage.submitFormInput.click();
    }

    @Then("Verify the user see the following modules:")
    public void verifyTheUserSeeTheFollowingModules(List<String> expected) {
        List<String> actual = new ArrayList<>();

        for (WebElement eachHomeModule : homePage.HomeModules) {
            actual.add(eachHomeModule.getText());
        }
        Assert.assertEquals(expected,actual);
    }
}
