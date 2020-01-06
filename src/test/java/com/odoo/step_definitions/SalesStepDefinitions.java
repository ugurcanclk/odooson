package com.odoo.step_definitions;

import com.odoo.pages.SalesPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SalesStepDefinitions {

    SalesPage salesPage=new SalesPage();
    @When("user is on the {string} page")
    public void user_is_on_the_page(String module) {
        //BrowserUtils.waitFor(5);
        BrowserUtils.waitForPageToLoad(5);
        salesPage.sales.click();
    }

    @Given("click create button")
    public void click_create_button() {
        //BrowserUtils.waitFor(5);
        BrowserUtils.waitForPageToLoad(5);
        salesPage.create.click();

    }

    @Then("create page open")
    public void create_page_open() {
        BrowserUtils.waitFor(5);
       // BrowserUtils.waitForPageToLoad(7);
        String expectedTitle="New - Odoo";
        Assert.assertEquals(expectedTitle,salesPage.getTitle());

    }
}
