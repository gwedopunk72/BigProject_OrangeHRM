package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC011 extends TC000 {

    /**
     * [TC011] Forgot password using valid username
     */

    @Test
    public void CheckForgotPassValidUser () throws InterruptedException {
        login.clickBtnForgotPass();
        Thread.sleep(2000);
        login.inputUserForgot("Admin");
        login.clikBtnReset();
        Assert.assertTrue(driver.getPageSource().contains("Password reset has been sent yo your email."));
    }
}
