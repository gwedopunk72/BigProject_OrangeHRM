package test.loginFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageHome;
import pages.PageLogin;
import pages.PageSupport;

public class TC003 extends TC000 {

    /**
     * [TC003] Login with empty password
     */

    @Test
    public void loginEmptyPass() throws InterruptedException {

        login.inputUsername("Admin");
        login.inputPassword(" ");
        Thread.sleep(2000);

        login.clickBtnLogin();
        Thread.sleep(1000);

        Assert.assertTrue(driver.getPageSource().contains("Password cannot be empty"));
    }
}
