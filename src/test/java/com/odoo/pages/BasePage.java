package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[contains (text(),'Sales')]")
    public WebElement sales;

    @FindBy(xpath = "//span[contains (text(),'CRM')]")
    public WebElement crm;

    @FindBy(xpath = "//span[contains (text(),'Calendar')]")
    public WebElement calendar;

    public String getTitle(){
        String title=Driver.get().getTitle();
        return title;
    }
































}
