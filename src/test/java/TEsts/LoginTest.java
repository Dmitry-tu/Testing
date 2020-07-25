package TEsts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.confirmationpage.ConfirmationPage;
import page.signinpage.SigninPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    SigninPage signinPage;
    ConfirmationPage confirmationPage;

    @BeforeMethod
    public void setup() {
       signinPage = new SigninPage();
       confirmationPage = new ConfirmationPage();
       signinPage.open();

    }

    @Test
    public void successfulLoginTest() {

       signinPage.insertLogin("demo");
       signinPage.insertPassword("demo");
       signinPage.clickLoginButton();

        assertTrue(confirmationPage.isDisplayed());


    }
    @AfterMethod
    public void tearDown() {
        super.tearDown();
        signinPage = null;
        confirmationPage = null;
    }
}
