package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC006 extends TC000 {

    /**
     * Click on OrangeHRM hyperlink
     */

    @Test
    public void CheckOrangeHRMlink () throws InterruptedException {

//      Get handles of the windows
        String mainWindow = driver.getWindowHandle();
        login.clickBtnOrangeHRM();

//      Switch to new window
        for (String newWindow : driver.getWindowHandles()){
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String OrangeLink = driver.getCurrentUrl();
        Assert.assertEquals(OrangeLink, "https://www.orangehrm.com/" );
        driver.close();

//      Switch back to original browser (first window)
        driver.switchTo().window(mainWindow);
    }
}
