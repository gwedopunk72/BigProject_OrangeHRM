package test.MainMenuFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC024 extends TC00 {

    /**
     * [TC024] Dashboard apply new leave feature
     */

    @Test
    public void DashboardApplyNewLeaveFeature() throws InterruptedException {

        dashboard.clickMenuDashboard();
        dashboard.clickMenuApplyLeave();
        Assert.assertTrue(driver.getPageSource().contains("Apply new leave request"));
    }
}