package admin.positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminDashBoard;
import pages.AdminLoginPage;
import utils.Browser;
import utils.CommonVerifcations;

public class AdminLoginTest {

    @BeforeMethod
    public void setUp() {

        Browser.open("chrome");

    }

    @Test
    public void successfulAdminLoginTest() {

        AdminLoginPage.goTo();
        AdminLoginPage.login("admin", "parola123!");


        CommonVerifcations.verifyTitle("Dashboard", "errorInCaseTheLogginIsNotSuccessful");

        AdminDashBoard.logout();

    }


    @AfterMethod
    public void tearDown() {

         Browser.quit();

    }
}
