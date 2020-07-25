package page;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{
     String pageURL = "https://idemo.bspb.ru/";
    By usernameInput = By.name("username");
    By passwordInput = By.name("password");
    static By signInButton =  By.id("login-button");

    public void insertLogin(String login) {
        lookForElement(usernameInput).sendKeys(login);

    }

    public void insertPassword(String password) {
        lookForElement(passwordInput).sendKeys(password);

    }

    public static void clickLoginButton() {
        lookForElement(signInButton).click();

    }

    public void open() {
        driver.get(pageURL);

    }
}
