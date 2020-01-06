package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage {


    public CalendarPage(){
        PageFactory.initElements(Driver.get(), this);
    }


        @FindBy(xpath = "//button[.='Month']")
        public WebElement month;
        @FindBy(xpath = "//td[@class='fc-day fc-widget-content fc-sun fc-today fc-state-highlight']")
        public WebElement birthday;

        @FindBy(xpath = "//input[@name='name']")
        public WebElement summary;

        @FindBy(xpath = "//span[contains(text(),'Create')]")
        public WebElement create;




}
