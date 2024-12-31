package tests;

import dto.BookDTO;
import org.baseClasses.BaseUITest;
import org.testng.annotations.Test;
import org.utilities.RandomUtils;
import pages.BookPage;
// This test verifies the ability to fill out a new address form on the page automatically,

public class BookTest extends BaseUITest {
    @Test(description = "check")
    public void test() {

        BookPage bookPage = new BookPage();
        BookDTO bookDTO = new BookDTO();
        webActions.clickButton(bookPage.btnAddress);
        waitWebActions.waitForElementToBeEnable(bookPage.btnNewAddress);
        webActions.clickButton(bookPage.btnNewAddress);

        waitWebActions.waitForElementToBeEnable(bookPage.txtFirstName);
        webActions.setText(bookPage.txtFirstName, bookDTO.getFirstName());

        waitWebActions.waitForElementToBeEnable(bookPage.txtLastName);
        webActions.setText(bookPage.txtLastName, bookDTO.getLastName());

        waitWebActions.waitForElementToBeEnable(bookPage.txtAddress);
        webActions.setText(bookPage.txtAddress, bookDTO.getAddress());

        waitWebActions.waitForElementToBeEnable(bookPage.txtCity);
        webActions.setText(bookPage.txtCity, bookDTO.getCity());

        waitWebActions.waitForElementToBeEnable(bookPage.txtPhone);
        webActions.setText(bookPage.txtPhone, bookDTO.getPhone());

    }
}
