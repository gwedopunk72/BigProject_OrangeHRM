package test.loginFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC007 extends TC000 {

    /**
     * [TC007] Click on Linkedin button
     */

    @Test
    public void CheckLinkedinLink () throws InterruptedException {
        String mainWindow = driver.getWindowHandle();
        login.clickBtnLinkedin();
        for (String newWindow : driver.getWindowHandles()){
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String LinkedinLink = driver.getCurrentUrl();
        Assert.assertEquals(LinkedinLink, "https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fgroups%3Fhome%3D%26gid%3D891077&trk=login_reg_redirect" );
        driver.close();
        driver.switchTo().window(mainWindow);
    }
}
