package utils;

import org.testng.Assert;

public class CommonVerifcations {
    /**
     * Method which verifies the title based on the provided expected title and logs a message in case of assert failure.
     * @param expectedTitle
     * @param errorMessegeTitleIsNotEqual
     */

    public static void verifyTitle(String expectedTitle, String errorMessegeTitleIsNotEqual) {
        String actualtitle = Browser.driver.getTitle();
        Assert.assertEquals(actualtitle,expectedTitle,errorMessegeTitleIsNotEqual);
    }
}
