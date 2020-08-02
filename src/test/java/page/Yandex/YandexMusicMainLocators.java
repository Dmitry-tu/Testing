package page.Yandex;

import org.openqa.selenium.By;

public class YandexMusicMainLocators {
    protected static final By inButton = By.xpath("/html/body/div[1]/div[6]/div[1]" + //кнопка на сайте (Войти)
            "/div[2]/a/span/span");
    protected static final By inButtonLabel = By.xpath ("/html/body/div[1]/div[6]/div/div[2]/span/div");
    protected static final By accountName = By.xpath ("/html/body/div[11]/div/ul/li[2]/span/span/div");

}

