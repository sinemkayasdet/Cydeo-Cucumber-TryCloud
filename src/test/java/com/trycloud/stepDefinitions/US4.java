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
import org.openqa.selenium.WebElement;

public class US4 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CommonElementPAge commonElementPAge =new CommonElementPAge();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginBy();

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        homePage.headerModule(string);
    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
       commonElementPAge.checkBoxutton.click();

    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {

        for (WebElement listCheckBox : commonElementPAge.listCheckBox) {
            Assert.assertTrue(listCheckBox.getAttribute("class").contains("select"));
        }
    }



}
