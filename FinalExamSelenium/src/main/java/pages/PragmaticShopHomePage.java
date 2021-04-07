package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Browser;

public class PragmaticShopHomePage {

    private final static String PRAGMATIC_SHOP_HOME_PAGE = "http://shop.pragmatic.bg/";
    private final static By MY_ACCOUNT_BUTTON = By.xpath("//span[text()='My Account']");
    private final static By REGISTER_BUTTON = By.xpath("//a[text()='Register']");
    private final static By LOGIN_BUTTON = By.xpath("//a[text()='Login']");

    /**
     * This method go to Pragmatic shop Home page
     */
    public static void goTo() {
        Browser.driver.get(PRAGMATIC_SHOP_HOME_PAGE);
    }

    /**
     * This method click button for registration
     */
    public static void clickRegistrationButton() {

        Browser.driver.findElement(MY_ACCOUNT_BUTTON).click();
        Browser.driver.findElement(REGISTER_BUTTON).click();

    }

    /**
     * This method click on Login button
     */
    public static void clickLoginButton() {
        Browser.driver.findElement(MY_ACCOUNT_BUTTON).click();
        Browser.driver.findElement(LOGIN_BUTTON).click();
    }


}


