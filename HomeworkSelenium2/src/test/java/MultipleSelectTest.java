import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class MultipleSelectTest {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() {

        Select allColorsOptions = new Select(driver.findElement(By.xpath("//select[@name='color']")));

        Actions builder = new Actions(driver);

        builder
                .keyDown(Keys.CONTROL)
                .click(driver.findElement(By.xpath("//select//option[@value='rd']")))
                .click(driver.findElement(By.xpath("//select//option[@value='sl']")))
                .keyUp(Keys.CONTROL)
                .perform();

        assertEquals(allColorsOptions.getAllSelectedOptions().size(), 2);

        List<String> expectedOptions = Arrays.asList("Red", "Silver");
        List<String> actualOptions = new ArrayList<String>();

        for (WebElement option : allColorsOptions.getAllSelectedOptions()) {
            actualOptions.add(option.getText());
        }


        assertEquals(actualOptions, expectedOptions);
    }


    @AfterMethod
    public void setDown() {

        driver.close();
        driver.quit();

    }


}
