import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ActionClassTraining {


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

        WebElement allColorsOptions = driver.findElement(By.xpath("//select[@name='color']"));

        Select color = new Select(allColorsOptions);

        assertTrue(color.isMultiple());

        color.selectByValue("wt");
        color.selectByValue("br");

        assertEquals(color.getAllSelectedOptions().size(),2);

        List<String>expOpt=Arrays.asList("White","Brown");
        List<String>actOpt= new ArrayList<String>();
        List<WebElement>allSelectedOptions=color.getAllSelectedOptions();

        for(WebElement option : allSelectedOptions){
            actOpt.add(option.getText());
        }

        assertEquals(actOpt.toArray(),expOpt.toArray());


    }
    @AfterMethod
    public void setDown(){




    }

}
