package org.selenium;

import org.openqa.selenium.WebDriver;
// Utility class for managing WebDriver instances with thread-local storage for parallel test execution.
public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private DriverManager() {}

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver.set(driver);
    }

    public static void quit() {
        DriverManager.driver.get().quit();
        driver.remove();
    }

}
