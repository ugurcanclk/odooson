package com.odoo.step_definitions;

import com.odoo.pages.CalendarPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;



public class CalenderStepdefs {

    CalendarPage calendarPage = new CalendarPage();

    @And("the user goes to calender page and enters note on calender")
    public void the_user_goes_to_calender_page_and_enters_note_on_calender() {
        // Write code here that turns the phrase above into concrete actions
        calendarPage.calendar.click();
        calendarPage.month.click();
    }
    @Then("user sees the note on the calender")
    public void user_sees_the_note_on_the_calender() {

        }

}