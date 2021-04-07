package admin.negative;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminLoginPage;
import utils.Browser;

public class AdminLoginTest {

    @BeforeMethod
    public void setUp(){

        Browser.open("chrome");
    }

    @Test
    public void unsuccessfulAdminLogIn(){
        AdminLoginPage.goTo();
        AdminLoginPage.login("J oro","parola123!");
        AdminLoginPage.verifyErrorValidationMassege("expectedErrorMessege","The expected validation error message is INCORRECT!");
    }

    @AfterMethod
    public void setDown(){
        Browser.quit();
    }
}
