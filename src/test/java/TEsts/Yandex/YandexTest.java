package TEsts.Yandex;

import TEsts.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Yandex.YandexMusicLogin;
import page.Yandex.YandexMusicMain;

public class YandexTest extends BaseTest {
    YandexMusicMain yandexMusicMain;
    YandexMusicLogin yandexMusicLogin;


    @BeforeMethod
    public void setup() {
        yandexMusicLogin = new YandexMusicLogin();
        yandexMusicMain = new YandexMusicMain();
        yandexMusicMain.open();

    }

    @Epic("Testing for https://music.yandex.ru/home")
    @Feature(value = "Successful Login with valid data")
    @Severity(SeverityLevel.BLOCKER)
    @Description("In this test we will login with correct data.When we logged we see our account screen")
    @Story("Test for login with valid data")
    @Test
    public void successfulLoginTest() throws InterruptedException {
        yandexMusicMain.CheckAuthorisation();
        yandexMusicLogin.UserNameClickEnter("Testomatio");
        yandexMusicLogin.PasswordNameClickEnter("Test.stay.strong");
        yandexMusicMain.ClickIcon();
        yandexMusicMain.CompareUserName("Testomatio");


    }
}
