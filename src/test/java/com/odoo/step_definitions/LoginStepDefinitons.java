package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import com.odoo.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitons {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opening the login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String sEmail = ConfigurationReader.get("sales_manager_email");
        String sPassword = ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(sEmail, sPassword);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions

        BrowserUtils.waitFor(2);
        String actualTitle =Driver.get().getTitle();
        Assert.assertEquals("Odoo",actualTitle);
        System.out.println("Verifying that user is logged in");
    }






}
