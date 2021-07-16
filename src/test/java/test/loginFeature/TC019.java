package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC019 extends TC000 {

    /**
     * [TC018] Logout from account
     */

    @Test
    public void LogoutSession () throws InterruptedException {
        home.clickMenuProfile();
        Thread.sleep(3000);
        home.clickMenuLogout();
        String loginPage = driver.getCurrentUrl();
        Assert.assertEquals(loginPage, "http://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.quit();
    }
}
