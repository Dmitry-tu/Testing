package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utills.WebDriverListener;

public class DriverSingleton {
    private static EventFiringWebDriver driver;


    private DriverSingleton() {

    }

    public static WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver","e:\\Работа\\Testing\\src\\main\\resources\\chromedriver.exe");
            driver = new EventFiringWebDriver(new ChromeDriver());
            driver.register(new WebDriverListener());
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
