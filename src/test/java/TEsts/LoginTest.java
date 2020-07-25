package TEsts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.ConfirmationPage;
import page.SigninPage;

public class LoginTest {
    SigninPage signinPage;
    ConfirmationPage confirmationPage;

    @BeforeMethod
    public void setup() {

        signinPage.open();

    }

    @Test
    public void successfulLoginTest() {
        SigninPage.insertLogin("demo");
        SigninPage.insertPassword("demo");
        SigninPage.clickLoginButton();

        //assertTrue(confirmationPage.isDisplayed());


    }

    @AfterMethod
    public void tearDown() {

    }
}
