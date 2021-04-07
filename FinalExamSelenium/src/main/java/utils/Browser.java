package utils;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static ChromeDriver driver;

    /**
     * This method set up the browser !
     * @param typeBrowser
     */
    public static void open(String typeBrowser){
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
     * This method close the browser .
     */
    public static void quit() {
        Browser.driver.quit();
    }
}

