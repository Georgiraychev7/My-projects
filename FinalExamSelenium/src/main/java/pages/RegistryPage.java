package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.reporters.EmailableReporter;
import utils.Browser;

import java.io.PipedReader;
import java.time.Duration;

public class RegistryPage {

    private final static By FIRST_NAME = By.id("input-firstname");
    private final static By LAST_NAME = By.id("input-lastname");
    private final static By E_MAIL = By.id("input-email");
    private final static By TELEPHONE = By.id("input-telephone");
    private final static By PASSWORD = By.id("input-password");
    private final static By PASSWORD_CONFIRM = By.id("input-confirm");
    private final static By CONTINUE_BUTTON = By.xpath("//input[@value='Continue']");

    /**
     * This method fill all the needed fields for registration ,
     * click on "Yes" at NewsLetter check box and accept Private Policy check box
     */
    public static void fillTheFields() {


        Browser.driver.findElement(FIRST_NAME).sendKeys("Georgi");
        Browser.driver.findElement(LAST_NAME).sendKeys("Raychev");
        Browser.driver.findElement(E_MAIL).sendKeys("chistonovmail@abv.bg");
        Browser.driver.findElement(TELEPHONE).sendKeys("0888888888");
        Browser.driver.findElement(PASSWORD).sendKeys("123456!");
        Browser.driver.findElement(PASSWORD_CONFIRM).sendKeys("123456!");

        WebElement NewsLetterRadioButtonYes = Browser.driver.findElement(By.xpath("//input[@name='newsletter']"));
        if (!NewsLetterRadioButtonYes.isSelected()) {
            NewsLetterRadioButtonYes.click();
        }

        WebElement PrivatePolicyCheckBox = Browser.driver.findElement(By.xpath("//input[@name='agree']"));
        PrivatePolicyCheckBox.click();
        Browser.driver.findElement(CONTINUE_BUTTON).click();

    }

/**
 * This method verify that the News Letter check box is selected
 */
    public static void verifyNewsLetterRadioButton() {
        WebElement NewsLetterRadioButton = Browser.driver.findElement(By.xpath("//input[@name='newsletter']"));
        Assert.assertTrue(NewsLetterRadioButton.isSelected());
    }

    /**
     * This method verify that the Private policy check box is selected.
     */
    public static void verifyPrivatePolicyCheckBox() {
        WebElement PrivatePolicyCheckBox = Browser.driver.findElement(By.xpath("//input[@name='agree']"));
        Assert.assertTrue(PrivatePolicyCheckBox.isSelected());
    }

    /**
     * This method click on Continue button
     */
    public static void clickContinueButton() {
        Browser.driver.findElement(CONTINUE_BUTTON).click();
    }

    /**
     * This method verify text on Private policy error message .
     * @param expectedMessage
     * @param messageIsDifrent
     */
    public static void verifyErrorMessage(String expectedMessage, String messageIsDifrent) {
        WebElement errorMessage = Browser.driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Warning: You must agree to the Privacy Policy!";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }


}
