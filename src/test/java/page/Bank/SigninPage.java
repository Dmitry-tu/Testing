package page.Bank;

import page.BasePage;

import static page.Bank.SigninPageLocators.*;

public class SigninPage extends BasePage {
    String pageURL = "https://idemo.bspb.ru/";



    public void insertLogin(String login) {
        clean(USERNAME_INPUT);
        lookForElement(USERNAME_INPUT).sendKeys(login);

    }

    public void insertPassword(String password) {
        clean(PASSWORD_INPUT);
        lookForElement(PASSWORD_INPUT).sendKeys(password);


    }

    public void clickLoginButton() {
        lookForElement(SIGN_IN_BUTTON).click();

    }

    public void open() {
        super.open(pageURL);

    }
}
