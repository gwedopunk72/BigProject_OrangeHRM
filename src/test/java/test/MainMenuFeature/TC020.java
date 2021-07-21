package test.MainMenuFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC020 extends TC00 {

    /**
     * [TC020] Search user from directory menu
     */

    @Test
    public void SearchUserFromDirectoryMenu() throws InterruptedException {

        // Login phase
        login.inputUsername("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickBtnLogin();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Welcome Karyawan"));

        directory.clikMenuDirectory();
        directory.inputFieldNameDir("karya");
        directory.clickBtnSearchDir();
        Assert.assertTrue(driver.getPageSource().contains("Karyawan Teladan"));
    }
}