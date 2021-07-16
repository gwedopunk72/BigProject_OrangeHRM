package test.loginFeature;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC018 extends TC000 {

    /**
     * [TC018] Change password using invalid format
     */

    @Test
    public void ChangePasswordUsingInvalidFormat () throws InterruptedException {

        home.clickMenuProfile();
        Thread.sleep(2000);
        changepass.ClickBttnSave();
        Thread.sleep(1000);
        changepass.InputCurrentPass("s3Kol4HQA!*");
        changepass.InputNewPass("ilsy2021");
        changepass.InputConNewPass("ilsy2021");
        changepass.ClickBttnSave();
        Assert.assertTrue(driver.getPageSource().contains("Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password."));

    }
}
