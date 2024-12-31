package org.webActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
// Utility class for waiting on web element conditions to ensure test stability.
public class WaitWebActions {

    private static  WebDriverWait wait;
    final static int SECONDS = 120;


    public WaitWebActions(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(SECONDS));
    }


    public void waitForElementNotBeExist(WebElement element) {

        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForElementHaveValue(WebElement element) {
        wait.until(ExpectedConditions.attributeToBeNotEmpty(element, "value"));
    }

    public void waitForElementToBeEnable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementBeSelected(WebElement element) {
        wait.until(ExpectedConditions.elementToBeSelected(element));
    }
}
