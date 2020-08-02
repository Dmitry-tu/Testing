package page.Yandex;

import page.BasePage;

import static page.Yandex.YandexMusicMainLocators.*;

public class YandexMusicMain extends BasePage {
    String pageURl = "https://music.yandex.ru/home";

    public void CheckAuthorisation() {
        lookForElement(inButton).click();
    }

    public void open() {
        super.open(pageURl);

    }

    public void ClickIcon() {
        clickJs(inButtonLabel);


    }
    public void CompareUserName(String text){
        getText(accountName,text);
    }

}

