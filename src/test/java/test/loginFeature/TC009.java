package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC009 extends TC000 {

    /**
     * [TC009] Click on Twitter button
     */

    @Test
    public void CheckTwitterLink () throws InterruptedException {
        String mainWindow = driver.getWindowHandle();
        login.clickBtnTwitter();
        for (String newWindow : driver.getWindowHandles()){
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String TwitterLink = driver.getCurrentUrl();
        Assert.assertEquals(TwitterLink, "https://twitter.com/orangehrm");
        driver.close();
        driver.switchTo().window(mainWindow);
    }
}
