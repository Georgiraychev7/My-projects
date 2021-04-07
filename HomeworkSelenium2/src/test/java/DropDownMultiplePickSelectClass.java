import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DropDownMultiplePickSelectClass {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @Test
    public void test(){

        WebElement multipleColorDropDown = driver.findElement(By.name("color"));
         Select color = new Select(multipleColorDropDown);

        assertTrue(color.isMultiple());

        assertEquals(color.getOptions().size(),5);

        color.selectByVisibleText("Red");
        color.selectByVisibleText("Silver");

        assertEquals(color.getAllSelectedOptions().size(),2);

        List<String>expectedOptions = Arrays.asList("Red","Silver");
        List<String>actualOptions = new ArrayList<>();
        List<WebElement>allOptions = color.getAllSelectedOptions();

        for(WebElement option : allOptions){
            actualOptions.add(option.getText());
        }

        expectedOptions.toArray();
        actualOptions.toArray();

       assertEquals(actualOptions,expectedOptions);


    }


    @AfterMethod
    public void setDown(){

        driver.close();
        driver.quit();

    }



}
