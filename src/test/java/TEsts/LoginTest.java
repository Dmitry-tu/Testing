package TEsts;

import Driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.ConfirmationPage;
import page.SigninPage;

import static org.testng.Assert.assertTrue;

public class LoginTest {
    SigninPage signinPage;
    ConfirmationPage confirmationPage ;

    @BeforeMethod
    public void setup() {
        signinPage = new SigninPage();
        signinPage.open();

    }

    @Test
    public void successfulLoginTest() {
        confirmationPage = signinPage.insertLogin("demo")
                                     .insertPassword("demo")
                                     .clickLoginButton();

        assertTrue(confirmationPage.isDisplayed());


    }

    @AfterMethod
    public void tearDown() {
        signinPage = null;
        confirmationPage = null;
    }
}
