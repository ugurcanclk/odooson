package com.odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy (xpath = "//b[contains(text(),'Sign in')]")
    public WebElement signIn;
    @FindBy(id ="login")
    public WebElement email;
    @FindBy (id ="password")
    public WebElement password;
    @FindBy (xpath =" //button[@class='btn btn-primary']")
    public WebElement login;
    public void login(String emailStr, String passwordStr) throws InterruptedException {
        signIn.click();
        Thread.sleep(1000);
        email.sendKeys(emailStr);
        password.sendKeys(passwordStr);
        login.click();
        // verification that we logged
    }}