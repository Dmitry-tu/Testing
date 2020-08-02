package page.Yandex;

import page.BasePage;

import static page.Yandex.YandexMusicLocator.passwordBox;
import static page.Yandex.YandexMusicLocator.userNameBox;

public class YandexMusicLogin extends BasePage {
    public void UserNameClickEnter(String text) {
        WindowCloser();
        SendKeysEnter(userNameBox, text);

    }

    public void PasswordNameClickEnter(String text) {
        SendKeysEnter(passwordBox, text);

    }

}
