package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC013 extends TC000 {

    /**
     * [TC013] Forgot password using empty username
     */

    @Test
    public void CheckForgotPassEmptyUser () throws InterruptedException {
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        Thread.sleep(3000);
        login.clickBtnForgotPass();
        Thread.sleep(2000);
        login.inputUserForgot("  ");
        login.clikBtnReset();
        Assert.assertTrue(driver.getPageSource().contains("Username cannot be empty"));
    }
}