package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC008 extends TC000 {

    /**
     * [TC008] Click on Facebook button
     */

    @Test
    public void CheckFacebookLink () throws InterruptedException {
        String mainWindow = driver.getWindowHandle();
        login.clickBtnFacebook();
        for (String newWindow : driver.getWindowHandles()){
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String FacebookLink = driver.getCurrentUrl();
        Assert.assertEquals(FacebookLink, "https://www.facebook.com/OrangeHRM");
        driver.close();
        driver.switchTo().window(mainWindow);
    }
}
