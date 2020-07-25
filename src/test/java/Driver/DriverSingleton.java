package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.LogManager.*;

public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton() {

    }
    public static WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver","e:\\Работа\\Testing\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
