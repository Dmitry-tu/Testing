package page.Yandex;

import org.openqa.selenium.By;

public class YandexMusicMainLocators {
    //кнопка на сайте (Войти)
    protected static final By inButton = By.xpath("/html/body/div[1]/div[6]/div[1]" +
            "/div[2]/a/span/span");
    // кнопка аккаунта
    protected static final By inButtonLabel = By.xpath("/html/body/div[1]/div[6]/div/div[2]/span/div");
    //название аккаунта в выпадашке
    protected static final By accountName = By.xpath("//div[@class='multi-auth__user-name typo']");

}

