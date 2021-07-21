package test.MainMenuFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC021 extends TC00 {

    /**
     * [TC021] Dashboard assign leave feature
     */

    @Test
    public void DashboardAssignleavefeature() throws InterruptedException {

        dashboard.clickMenuDashboard();
        dashboard.clickMenuAssLeave();
        Assert.assertTrue(driver.getPageSource().contains("Assign new leave reaquest"));
    }
}