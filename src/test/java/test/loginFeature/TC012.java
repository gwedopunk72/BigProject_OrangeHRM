package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC012 extends TC000 {

    /**
     * [TC012] Forgot password using invalid username
     */

    @Test
    public void CheckForgotPassInvalidUser () throws InterruptedException {
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        Thread.sleep(3000);
        login.clickBtnForgotPass();
        Thread.sleep(2000);
        login.inputUserForgot("&+>");
        login.clikBtnReset();
        Assert.assertTrue(driver.getPageSource().contains("Error Invalid credentials"));
    }
}