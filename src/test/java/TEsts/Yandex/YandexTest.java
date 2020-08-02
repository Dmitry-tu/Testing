package TEsts.Yandex;

import TEsts.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Yandex.YandexMusicLogin;
import page.Yandex.YandexMusicMain;

public class YandexTest extends BaseTest {
    YandexMusicMain yandexMusicMain;
    YandexMusicLogin yandexMusicLogin;


    @BeforeMethod
    public void setup(){
        yandexMusicLogin = new YandexMusicLogin();
        yandexMusicMain = new YandexMusicMain();
        yandexMusicMain.open();

    }
    @Test
    public void successfulLoginTest() throws InterruptedException {
        yandexMusicMain.CheckAuthorisation();
        yandexMusicLogin.UserNameClickEnter("Testomatio");
        Thread.sleep(5000);
        yandexMusicLogin.PasswordNameClickEnter("Test.stay.strong");
        Thread.sleep(10000);
        yandexMusicMain.ClickIcon();
        yandexMusicMain.CompareUserName("test.y4ndex913.test.test");


    }
//    @Test
//    public void unsuccessfulLoginTest() {
//        yandexMusicMain.CheckAuthorisation();
//        yandexMusicLogin.UserNameClickEnter("Testomatio");
//        Thread.sleep(5000);
//    }
}
