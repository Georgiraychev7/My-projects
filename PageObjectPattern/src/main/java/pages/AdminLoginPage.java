package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import utils.Browser;

public class AdminLoginPage {

    private static final String ADMIN_LOGIN_PAGE_URL = "http://shop.pragmatic.bg/admin/" ;

    private static final By LOC_USERNAME = By.id("input-username");
    private static final By LOC_PASSWORD = By.id("input-password");
    private static final By LOC_LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final By LOC_ERROR_VALIDATION_MESSAGE = By.cssSelector(".alert.alert-danger.alert-dismissible");

    /**
     * This method go to the admin login page
     */
    public static void goTo() {

        Browser.driver.get(ADMIN_LOGIN_PAGE_URL);
    }

    /**
     * Method that logins a user by username and password
     * @param username
     * @param password
     */

    public static void login(String username, String password) {

        Browser.driver.findElement(LOC_USERNAME).sendKeys(username);
        Browser.driver.findElement(LOC_PASSWORD).sendKeys(password);
        Browser.driver.findElement(LOC_LOGIN_BUTTON).click();

    }

    /**
     * Method which verifies the login error validation message of the admin login page.
     * @param expectedErrorMessege
     * @param messageInCaseOfIncorrectValidationMessage
     */
    public static void verifyErrorValidationMassege(String expectedErrorMessege, String messageInCaseOfIncorrectValidationMessage) {

        String actualErrorMessege = Browser.driver.findElement(LOC_ERROR_VALIDATION_MESSAGE).getText();
        Assert.assertTrue(actualErrorMessege.contains(expectedErrorMessege));

    }


}
