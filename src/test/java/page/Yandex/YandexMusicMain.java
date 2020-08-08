package page.Yandex;

import io.qameta.allure.Step;
import page.BasePage;

import static page.Yandex.YandexMusicMainLocators.*;

public class YandexMusicMain extends BasePage {
    String pageURl = "https://music.yandex.ru/home";


    @Step(value = "Open page of Web site")
    public void open() {
        super.open(pageURl);

    }

    @Step(value = "Choose button(Log In) on web site and ")
    public void CheckAuthorisation() {
        windowHandle(0);
        lookForElement(inButton).click();


    }

    @Step(value = "Click icon of our account")
    public void ClickIcon() {
        windowHandle(0);
        lookForElement(inButtonLabel).click();


    }
    @Step(value = "Compare account name with our data(to understand on our account we is or not)")
    public void CompareUserName(String text) {
        getText(accountName, text);

    }

}

