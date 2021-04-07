package registrationTests.negative;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PragmaticShopHomePage;
import pages.RegistryPage;
import utils.Browser;
import utils.CommonVerification;

public class RegistrationTest {


    @BeforeMethod
    public void setUp(){
        Browser.open("chrome");
    }

    @Test
    public void unsuccessfulRegistration(){
        PragmaticShopHomePage.goTo();
        CommonVerification.verifyTitle("Pragmatic Test Store","errorMessageTitleIsNotEqual");
        PragmaticShopHomePage.clickRegistrationButton();
        CommonVerification.verifyTitle("Register Account","errorMessegeTitleIsNotEqual");
        RegistryPage.clickContinueButton();
        RegistryPage.verifyErrorMessage(" Warning: You must agree to the Privacy Policy!","messageIsDifrent");



    }

    @AfterMethod
    public void setDown(){

        Browser.quit();

    }
}
