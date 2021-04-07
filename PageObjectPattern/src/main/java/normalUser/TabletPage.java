package normalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Browser;

import java.time.Duration;

public class TabletPage {


    public final static String TABLET_PAGE = "http://shop.pragmatic.bg/index.php?route=product/category&path=57" ;
    public final static By SAMSUNG_TAB = By.xpath("//a[text()='Samsung Galaxy Tab 10.1']");
    public final static By ADD_TO_CART_BUTTON = By.xpath("//span[text()='Add to Cart']");
    public final static By CART_BUTTON = By.id("cart-total");

    /**
     * This method go to Tablet page
     */
    public static void goTo() {

        Browser.driver.get(TABLET_PAGE);
    }

    /**
     * This method add tablet to cart
     */
    public static void addToCartTablet() {

        Browser.driver.findElement(SAMSUNG_TAB);
        Browser.driver.findElement(ADD_TO_CART_BUTTON).click();

    }

    /**
     * This method verify that the elements in cart are equals.
     * @param expectedText
     * @param errorMesegeTheProductIsNotEqual
     */
    public static void verifyEqualsOfProduct(String expectedText, String errorMesegeTheProductIsNotEqual) {
        String actualText = Browser.driver.findElement(SAMSUNG_TAB).getText();
        Assert.assertEquals(actualText,expectedText,errorMesegeTheProductIsNotEqual);
    }

    /**
     * This method verify that the product is added to cart.
     * @param expectedText
     * @param errorMessegeProductIsNotAdded
     */
    public static void verifyProductIsAdded(String expectedText, String errorMessegeProductIsNotAdded) {

        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.textToBe(CART_BUTTON, "1 item(s) - $241.99"));
        String actualText = Browser.driver.findElement(CART_BUTTON).getText();
        Assert.assertEquals(actualText,expectedText,errorMessegeProductIsNotAdded);

    }



    }

