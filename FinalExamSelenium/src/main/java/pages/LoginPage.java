package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class LoginPage {


    private final static By EMAIL = By.id("input-email");
    private final static By PASSWORD = By.id("input-password");
    private final static By LOGIN_BUTTON = By.xpath("//input[@value='Login']");

    /**
     * This method fill the e-mail and password fields with correct inputs
     */
    public static void login() {

        Browser.driver.findElement(EMAIL).sendKeys("chistonovmail@abv.bg");
        Browser.driver.findElement(PASSWORD).sendKeys("123456!");
        Browser.driver.findElement(LOGIN_BUTTON).click();


    }
}
