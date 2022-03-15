package tests;

import Utils.User;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestClass {

    @Test
    public void testExample() throws Exception {
        User user = new User();
        HomePage homePage = new HomePage();
        homePage.getHeader(user).clickOnSignInButton().logIn(user).clickOnProfileButton().clickOnMyPreferencePageButton();

    }
}
