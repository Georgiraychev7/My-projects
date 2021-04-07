import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

import java.util.concurrent.TimeUnit;

public class TestLogin {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("http://shop.pragmatic.bg/admin/");
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
        assertTrue(userNameElement.isSelected());

        userNameElement.sendKeys("admin");

        passwordElement.click();
        if(!passwordElement.isSelected()){
            passwordElement.click();
        }

        assertTrue(userNameElement.isSelected());
        passwordElement.sendKeys("parola123!");

        logginButton.click();

        WebElement logoutElement = driver.findElement(By.cssSelector("span.hidden-sm"));
        logoutElement.click();


    }




   // @Test
  //  public void testWithWrongUsername(){
    //   WebElement userNameElement = driver.findElement(By.id("input-username"));
     //   WebElement passwordElement = driver.findElement(By.id("input-password"));
    //    WebElement logginButton = driver.findElement(By.cssSelector("button.btn"));

     //   userNameElement.click();
     //   if(!userNameElement.isSelected()){
      //      userNameElement.click();
      //  }
       // userNameElement.sendKeys("adminnnn");

      //  passwordElement.click();
     //   if(!passwordElement.isSelected()){
     //       passwordElement.click();
    //    }
      //  passwordElement.sendKeys("parola123456!");

     //   logginButton.click();
 //   }

    @AfterMethod
    public void setDown(){
        driver.close();
        driver.quit();

    }
}
