package org.baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.selenium.DriverManager;

public class BaseUIPage {
    protected BaseUIPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), 3), this);
    }
}
