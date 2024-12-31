package org.baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.webActions.WaitWebActions;
import org.webActions.WebActions;

import static org.config.ConfigurationManager.configuration;

public class BaseUITest {
    public WebDriver driver;

    public WebActions webActions;
    public WaitWebActions waitWebActions;

    @BeforeClass
    public void beforeClass() {
        //start log
        //start record
        openBrowser();
        initWebAction();
        login();
    }

    private void initWebAction(){
        webActions = new WebActions(driver);
        waitWebActions = new WaitWebActions(driver);
    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }

    private void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(configuration().url());
        DriverManager.setDriver(driver);
    }

    private void login() {
        BaseLoginPage loginPage = new BaseLoginPage();
        waitWebActions.waitForElementToBeEnable(loginPage.btn_myAccount);
        webActions.clickButton(loginPage.btn_myAccount);
        webActions.setText(loginPage.txt_Name, configuration().mailAddress());
        webActions.setText(loginPage.txt_password, configuration().userPassword());
        webActions.doubleClickElement(loginPage.btn_login);
        webActions.setText(loginPage.txt_password, configuration().userPassword());
        webActions.doubleClickElement(loginPage.btn_login);
        waitWebActions.waitForElementNotBeExist(loginPage.btn_login);
    }
}
