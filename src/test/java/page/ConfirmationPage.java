package page;

import org.openqa.selenium.By;

public class ConfirmationPage extends BasePage{
    String pageURL = "https://idemo.bspb.ru/auth/otp?authOptionId=SMS%3A10005";
    By confirmationWindow = By.xpath("//*[@id=\"login-form\"]/div[2]/div");


    public boolean isDisplayed(){
        return lookForElement(confirmationWindow).isDisplayed();
    }
    @Override
    public void open() {
        driver.get(pageURL);
    }
}
