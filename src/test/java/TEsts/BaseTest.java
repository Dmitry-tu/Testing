package TEsts;

import Driver.DriverSingleton;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    @AfterMethod
    public void  tearDown(){
        DriverSingleton.closeDriver();
    }

}
