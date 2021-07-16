package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC004 extends TC000 {

    /**
     * [TC004] Login with invalid username
     */

    @Test
    public void loginInvalidUser() throws InterruptedException {
        login.inputUsername("iwakpitik");
        login.inputPassword("s3Kol4HQA!*");
        Thread.sleep(2000);

        login.clickBtnLogin();
        Thread.sleep(1000);

        Assert.assertTrue(driver.getPageSource().contains("Invalid credentials"));
    }
}
