import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DropDownTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("http://shop.pragmatic.bg/admin/index.php?route=sale/order&user_token=AOZ0GgQi6XgEpl81uoFdnMArDsiRg26s");
        driver.manage().window().maximize();
        driver.manage().window().maximize(); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void test(){
        WebElement userNameElement = driver.findElement(By.id("input-username"));
        WebElement passwordElement = driver.findElement(By.id("input-password"));
        WebElement logginButton = driver.findElement(By.cssSelector("button.btn"));

        userNameElement.click();
        if(!userNameElement.isSelected()){
            userNameElement.click();
        }


        userNameElement.sendKeys("admin");

        passwordElement.click();
        if(!passwordElement.isSelected()){
            passwordElement.click();
        }

        passwordElement.sendKeys("parola123!");

        logginButton.click();


        WebElement dropDownElement = driver.findElement(By.id("input-order-status"));
        Select make = new Select(dropDownElement);

        assertFalse(make.isMultiple());
        assertEquals(make.getOptions().size(),16);


        List<String>expectedOptions = Arrays.asList("","Missing Orders","Canceled","Canceled Reversal",
                "Chargeback" ,"Complete","Denied" ,"Expired","Failed","Pending","Processed",
                "Processing","Refunded","Reversed","Shipped","Voided");

        List<String>actualOptions = new ArrayList<String>();
        List<WebElement>allOptions = make.getOptions();


        for(WebElement option : allOptions)
            actualOptions.add(option.getText());

        assertEquals(actualOptions.toArray(),expectedOptions.toArray());

        WebElement logoutElement = driver.findElement(By.cssSelector("span.hidden-sm"));
        logoutElement.click();






    }



       @AfterMethod
       public void setDown(){
             driver.close();
            driver.quit();

       }

    }














