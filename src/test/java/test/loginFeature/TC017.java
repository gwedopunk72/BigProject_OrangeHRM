package test.loginFeature;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC017 extends TC000 {

    /**
     * [TC017] Change password with empty field
     */

    @Test
    public void ChangePassEmptyField () throws InterruptedException {

        Thread.sleep(3000);
        home.clickMenuChangepass();
        Thread.sleep(2000);
        changepass.ClickBttnSave();
        Thread.sleep(1000);
        changepass.ClickBttnSave();
        Assert.assertTrue(driver.findElement(By.cssSelector(".inner li:nth-of-type(2) span")).isDisplayed());

    }
}
