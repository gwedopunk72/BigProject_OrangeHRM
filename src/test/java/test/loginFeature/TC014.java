package test.loginFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC014 extends TC000 {

    /**
     * [TC014] Check alternative login feature
     */

    @Test
    public void CheckAlternativeLoginFeature () throws InterruptedException {
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        Thread.sleep(3000);
        login.clickBtnAlternative();
        Select select = new Select(driver.findElement(By.id("openIdProvider")));
        List<WebElement> dropdownvalues = select.getOptions();
        Assert.assertEquals(dropdownvalues, "Facebook, Google");
    }
}
