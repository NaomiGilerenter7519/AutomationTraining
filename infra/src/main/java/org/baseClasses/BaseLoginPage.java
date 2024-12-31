package org.baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaseLoginPage extends BaseUIPage{
    protected BaseLoginPage() {
        super();
    }

    @FindBy(how = How.XPATH,using = "//a[@aria-label=\"החשבון שלי\"]")
    public WebElement btn_myAccount;

    @FindBy(how = How.ID,using = "username")
    public WebElement txt_Name;
    @FindBy(how = How.ID,using = "password")
    public WebElement txt_password;

    //buttons
    @FindBy(how = How.NAME,using = "login")
    public WebElement btn_login;
}
