package page;

import Driver.DriverSingleton;
import org.openqa.selenium.*;

import static org.testng.Assert.assertTrue;

public class BasePage {
    protected final WebDriver driver = DriverSingleton.getDriver();

    protected WebElement lookForElement(By by) {

        return driver.findElement(by);

    }

    public void open(String pageURL) {
        driver.get(pageURL);

    }

    public void clean(By by) {
        WebElement element = lookForElement(by);
        element.clear();
    }

    public void SendKeysEnter(By by, String text) {
        WebElement element = lookForElement(by);
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);

    }

    public void WindowCloser() {
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

    }
    public void clickJs(By elementBy) {
        WebElement button = lookForElement(elementBy);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);
    }
    public void getText(By elementBy, String text) {
        WebElement element = lookForElement(elementBy);
        assertTrue (element.getText ().equals (text));
    }
}
