package page.Yandex;

import io.qameta.allure.Step;
import page.BasePage;

import static page.Yandex.YandexMusicMainLocators.*;

public class YandexMusicMain extends BasePage {
    String pageURl = "https://music.yandex.ru/home";

    @Step(value = "Authorisation on")
    public void CheckAuthorisation() {
        windowHandle(0);
        lookForElement(inButton).click();


    }

    public void open() {
        super.open(pageURl);

    }

    public void ClickIcon() {
        windowHandle(0);
        lookForElement(inButtonLabel).click();


    }

    public void CompareUserName(String text) {
        getText(accountName, text);

    }

}

