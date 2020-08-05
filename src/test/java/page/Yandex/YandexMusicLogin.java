package page.Yandex;

import page.BasePage;

import static page.Yandex.YandexMusicLocator.passwordBox;
import static page.Yandex.YandexMusicLocator.userNameBox;

public class YandexMusicLogin extends BasePage {
    public void UserNameClickEnter(String text) {
        windowHandle(1);
        SendKeysEnter(userNameBox, text);

    }

    public void PasswordNameClickEnter(String text) {
        SendKeysEnter(passwordBox, text);

    }

}
