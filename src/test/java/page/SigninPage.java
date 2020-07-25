package page;

import Driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage extends BasePage{
    static String pageURL = "https://idemo.bspb.ru/";
    static By usernameInput = By.name("username");
    static By passwordInput = By.name("password");
    static By signInButton =  By.id("login-button");

    public static void insertLogin(String login) {
        lookForElement(usernameInput).sendKeys(login);

    }

    public static void insertPassword(String password) {
        lookForElement(passwordInput).sendKeys(password);

    }

    public static void clickLoginButton() {
        lookForElement(signInButton).click();

    }

    public static void open() {
        driver.get(pageURL);

    }
}
