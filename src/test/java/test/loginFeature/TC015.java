package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC015 extends TC000 {

    /**
     * [TC015] Login valid username and password
     */

    @Test
    public void LoginValidUserAndPass () throws InterruptedException {
        login.inputUsername("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickBtnLogin();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Welcome Karyawan"));
    }
}
