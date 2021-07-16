package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC010 extends TC000 {

    /**
     * [TC010] Click on Youtube button
     */

    @Test
    public void CheckYoutubeLink () throws InterruptedException {
        String mainWindow = driver.getWindowHandle();
        login.clickBtnYoutube();
        for (String newWindow : driver.getWindowHandles()){
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String Youtubelink = driver.getCurrentUrl();
        Assert.assertEquals(Youtubelink, "https://www.youtube.com/c/OrangeHRMInc");
        driver.close();
        driver.switchTo().window(mainWindow);
    }
}
