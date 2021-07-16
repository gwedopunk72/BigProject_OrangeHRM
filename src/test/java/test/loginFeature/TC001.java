package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001 extends TC000{

    /**
     * Login with empty user and password
     */

    @Test
    public void loginEmptyUserAndPass() throws InterruptedException {

        driver.manage().window().maximize();
        Thread.sleep(2000);
        login.clickBtnLogin();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Username cannot be empty"));
    }
}