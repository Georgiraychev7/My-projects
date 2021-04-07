package registrationTests.positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PragmaticShopHomePage;
import utils.Browser;
import utils.CommonVerification;

public class UserLogin {


    @BeforeMethod
    public void setUp(){
        Browser.open("chrome");
    }

    @Test
    public void successfulLogin(){
        PragmaticShopHomePage.goTo();
        CommonVerification.verifyTitle("Pragmatic Test Store","errorMessageTitleIsNotEqual");
        PragmaticShopHomePage.clickLoginButton();
        CommonVerification.verifyTitle("Account Login","errorMessageTitleIsNotEqual");
        LoginPage.login();
    }

    @AfterMethod
    public void setDown(){
        Browser.quit();
    }
}
