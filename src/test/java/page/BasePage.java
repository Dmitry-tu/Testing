package page;

import Driver.DriverSingleton;
import org.openqa.selenium.*;

import java.util.ArrayList;

import static org.testng.Assert.assertTrue;

public class BasePage {
    protected final WebDriver driver = DriverSingleton.getDriver();
    private ArrayList<String> tabs;

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

    //метод нажатия кнопки Enter

    public void SendKeysEnter(By by, String text) {
        WebElement element = lookForElement(by);
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);

    }

    //скип выпадающих страниц Логина и Пароля на сайте Яндекс Музыке
    public void windowHandle(int tab) {
        if (tabs == null) {
            tabs = new ArrayList<>(driver.getWindowHandles());
        }
        driver.switchTo().window(tabs.get(tab));
    }


    //сравнение названия аккаунта с элементом названия аккаунта с целью проверки
    //нахождения на нужной странице нужного аккаунта
    public void getText(By elementBy, String text) {
        WebElement element = lookForElement(elementBy);
        assertTrue(element.getText().equals(text));
    }
}
