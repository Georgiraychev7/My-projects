package registrationTests.positive;

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
    public void successfulRegistrationTest(){

        PragmaticShopHomePage.goTo();
        CommonVerification.verifyTitle("Pragmatic Test Store","errorMessageTitleIsNotEqual");
        PragmaticShopHomePage.clickRegistrationButton();
        CommonVerification.verifyTitle("Register Account","errorMessageTitleIsNotEqual");
        RegistryPage.fillTheFields();
        RegistryPage.verifyNewsLetterRadioButton();
        RegistryPage.verifyPrivatePolicyCheckBox();

    }


    @AfterMethod
    public void setDown(){

       Browser.quit();

    }
}
