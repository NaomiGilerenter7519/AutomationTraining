package org.webActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WebActions {
    private WebDriver driver;

    public WebActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(WebElement button) {
        button.click();
    }
    public void doubleClickElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    public void setText(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void openSideTab(String sideTabName) {
        WebElement sideTab = driver.findElement(By.xpath(String.format("//li//a[text()='%s']", sideTabName)));
        sideTab.click();
    }

    public void openHeaderTab(String headerTabName) {
        WebElement sideTab = driver.findElement(By.xpath(String.format("//li//a[text()='%s']", headerTabName)));
        sideTab.click();
    }

    public void setDropDown(WebElement dropDown, String value) {
        dropDown.click();
        WebElement option = dropDown.findElement(By.xpath(String.format("//option[@label='%s']", value)));
        option.click();
        dropDown.click();
    }

    public void setDropDown(WebElement dropDown, int index) {
        dropDown.click();
        List<WebElement> option = dropDown.findElements(By.xpath(".//option"));
        option.get(index).click();
        dropDown.click();
    }

    public void goToTab(String tabName){
        WebElement tabElement= driver.findElement(By.xpath(String.format("//li//a[text()='%s']",tabName)));
        tabElement.click();
    }

    public void setRadioButton(String radioValue){
        WebElement tabElement= driver.findElement(By.xpath(String.format("//input[@aria-label='%s']",radioValue)));
        tabElement.click();
    }
}
