package test.MainMenuFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC027 extends TC00 {

    /**
     * [TC027] Dashboard check My Timesheet menu
     */

    @Test
    public void DashboardCheckMyTimesheetMenu() throws InterruptedException {

        dashboard.clickMenuDashboard();
        dashboard.clickMenuMyTimesheet();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("No Timesheet Found For Current Date"));
        driver.quit();
    }
}