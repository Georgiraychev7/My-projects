package normalUser;

import org.openqa.selenium.By;
import utils.Browser;
import utils.CommonVerifcations;


public class NormalUserMainPage {

    private static final String NORMAL_USER_MAIN_PAGE = "http://shop.pragmatic.bg/";
    private static final By SEARCH_BAR = By.cssSelector("input.form-control.input-lg");
    private static final By SEARCH_BUTTON = By.cssSelector("i.fa.fa-search");

    /**
     * This method go to main page with normal user.
     */

    public static void goTo() {

        Browser.driver.get(NORMAL_USER_MAIN_PAGE);
    }

    /**
     * This method fill in the search bar with current text
     * and search for him.
     * @param string
     */
    public static void cliclAndFillInSearchBarField(String string) {

        Browser.driver.findElement(SEARCH_BAR).sendKeys(string);
        Browser.driver.findElement(SEARCH_BUTTON).click();



    }


}
