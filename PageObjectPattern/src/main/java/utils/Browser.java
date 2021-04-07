package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * This class represents the utilization of a browser.
 */
public class Browser {

    public static WebDriver driver;

    /**
     * Method wich opens a browser by passed browser type.
     * Valid options :chrome , firefox , opera
     * @param typeBrowser
     */

    public static void open(String typeBrowser) {

        switch (typeBrowser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;
            case "firefox":
                break;
            case "opera":
                break;

            default:
                throw new RuntimeException("The browser that is chosen " + typeBrowser + " is not a valid browser!");
        }
    }

    /**
     * Method wich closes the browser.
     */

    public static void quit() {
        driver.quit();
    }
}
