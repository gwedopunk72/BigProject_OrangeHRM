package test.loginFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageHome;
import pages.PageLogin;
import pages.PageSupport;

public class TC005 extends TC000{

    /**
     * [TC005] Login with invalid password
     */

    @Test
    public void loginInvalidPass() throws InterruptedException {
        login.inputUsername("Admin");
        login.inputPassword("sekolahcilsy");
        Thread.sleep(2000);

        login.clickBtnLogin();
        Thread.sleep(1000);

        Assert.assertTrue(driver.getPageSource().contains("Invalid credentials"));
    }
}
