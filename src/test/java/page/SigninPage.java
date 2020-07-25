package page;

import Driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {
    WebDriver driver = DriverSingleton.getDriver();

    String pageURL = "https://idemo.bspb.ru/";
    By usernameInput = By.name("username");
    By passwordInput = By.name("password");
    By signInButton =  By.id("login-button");

    public WebElement lookForElement(By by) {
        return driver.findElement(by);
    }

    public void insertLogin(String login) {
        lookForElement(usernameInput).sendKeys(login);

    }

    public void insertPassword(String password) {
        lookForElement(passwordInput).sendKeys(password);

    }

    public void clickLoginButton() {
        lookForElement(signInButton).click();

    }

    public void open() {
        driver.get(pageURL);

    }
}
