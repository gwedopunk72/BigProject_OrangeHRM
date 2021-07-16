package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002 extends TC000 {

    /**
     * [TC002] Login with empty username
     */

    @Test
    public void loginEmptyUsername() throws InterruptedException {

        login.inputUsername("");
        login.inputPassword("s3Kol4HQA!*");
        Thread.sleep(2000);

        login.clickBtnLogin();
        Thread.sleep(1000);

        Assert.assertTrue(driver.getPageSource().contains("Username cannot be empty"));
    }
}
