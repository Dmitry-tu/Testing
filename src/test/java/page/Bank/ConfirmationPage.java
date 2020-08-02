package page.Bank;

import page.BasePage;

import static page.Bank.ConfirmationPageLocators.CONFIRMATION_WINDOW;

public class ConfirmationPage extends BasePage {
    String pageURL = "https://idemo.bspb.ru/auth/otp?authOptionId=SMS%3A10005";

    public boolean isDisplayed() {
        return lookForElement(CONFIRMATION_WINDOW).isDisplayed();
    }

    public void open() {
        super.open(pageURL);
    }
}
