import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

public class FrameTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/lecture13frames/Frames.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void test(){

        driver.switchTo().frame("left");
        WebElement leftFrameElement = driver.findElement(By.tagName("p"));
        assertEquals(leftFrameElement.getText(),"This is Left Frame");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("right");


        WebElement rightFrameElement = driver.findElement(By.tagName("p"));
        assertEquals(rightFrameElement.getText(),"This is Right Frame");


        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("left");

    }



    @AfterMethod
    public void setDown(){

        driver.close();
        driver.quit();

    }




}
