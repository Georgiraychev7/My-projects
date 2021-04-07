package utils;

import org.testng.Assert;

public class CommonVerification {

    /**
     * This method verify title of current page !
     * @param expectedTitle
     * @param errorMessageTitleIsNotEqual
     */
    public static void verifyTitle(String expectedTitle, String errorMessageTitleIsNotEqual) {

        String actualTitle = Browser.driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,errorMessageTitleIsNotEqual);
    }
}
