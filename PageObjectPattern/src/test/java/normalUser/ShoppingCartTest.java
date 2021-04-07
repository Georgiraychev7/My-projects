package normalUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Browser;
import utils.CommonVerifcations;

import java.time.Duration;

public class ShoppingCartTest {



    @BeforeMethod
    public void setUp() {
        Browser.open("chrome");
    }

    @Test
    public void ShoppingCartTest() {
        TabletPage.goTo();
        CommonVerifcations.verifyTitle("Tablets","errorMassegeTitleIsNotEqual");
        TabletPage.verifyEqualsOfProduct("Samsung Galaxy Tab 10.1","errorMesegeTheProductIsNotEqual");
        TabletPage.addToCartTablet();
        TabletPage.verifyProductIsAdded("1 item(s) - $241.99","errorMessegeProductIsNotAdded");
    }

    @AfterMethod
    public void setDown(){
        Browser.quit();
    }


}
