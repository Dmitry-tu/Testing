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

    public SigninPage insertLogin(String login) {
        lookForElement(usernameInput).sendKeys(login);
        return this;

    }

    public SigninPage insertPassword(String password) {
        lookForElement(passwordInput).sendKeys(password);
        return this;

    }

    public ConfirmationPage clickLoginButton() {
        lookForElement(signInButton).click();
        return new ConfirmationPage();

    }

    public void open() {
        driver.get(pageURL);

    }
}
