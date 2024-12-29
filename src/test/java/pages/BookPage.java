package pages;

import org.baseClasses.BaseUIPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
// This class represents a web page with elements identified based on their location in the DOM.
// The class serves as a Page Object, following the Page Object Model (POM) design pattern,
// which allows for simple and focused management of elements and interactions with web pages in the project.

public class BookPage extends BaseUIPage {
    @FindBy(how = How.XPATH,using = "//a[@title=\"כתובת\"]")
    public WebElement btnAddress;
    @FindBy(how = How.XPATH,using = "//a[@title=\"Add Address\"]")
    public WebElement btnNewAddress;

    @FindBy(how = How.ID,using = "billing_first_name")
    public WebElement txtFirstName;

    @FindBy(how = How.ID,using = "billing_address_1")
    public WebElement txtAddress;

    @FindBy(how = How.ID,using = "billing_last_name")
    public WebElement txtLastName;

    @FindBy(how = How.ID,using = "billing_phone")
    public WebElement txtPhone;

    @FindBy(how = How.ID,using = "billing_city")
    public WebElement txtCity;

    @FindBy(how = How.ID,using = "vm_Mismach")
    public WebElement drp_mismach;


    @FindBy(how = How.ID,using = "inpFileUploadNotIE9")
    public WebElement btn_Upload;



}
