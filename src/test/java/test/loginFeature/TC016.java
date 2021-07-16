package test.loginFeature;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC016 extends TC000 {

    /**
     * [TC016] Click about button inside profile menu
     */

    @Test
    public void CheckAboutMenu () throws InterruptedException {
        home.clickMenuProfile();
        Thread.sleep(2000);
        home.clickMenuAbout();
        Assert.assertTrue(driver.getPageSource().contains("Company Name: Sekolah QA"));
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div#displayAbout  .close")).click();
    }
}