package page;
import Driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
    WebDriver driver = DriverSingleton.getDriver();
    By confirmationWindow = By.xpath("//*[@id=\"login-form\"]/div[2]/div");


    public  WebElement lookForElement(By by){
        return driver.findElement(by);
    }

    public boolean isDisplayed(){
        return lookForElement(confirmationWindow).isDisplayed();
    }
}
