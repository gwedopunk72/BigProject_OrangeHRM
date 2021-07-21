package test.MainMenuFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC023 extends TC00 {

    /**
     * [TC023] Dashboard check view Employee Timesheet
     */

    @Test
    public void DashboardCheckViewEmployeeTimesheet() throws InterruptedException {

        dashboard.clickMenuDashboard();
        dashboard.clickMenuTimesheets();
        Thread.sleep(1000);
        dashboard.clickFieldEmploye();
        dashboard.inputTimeEmployee("Karyawan Teladan");
        dashboard.clickbtnView();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Actions Performed on the Timesheet"));

    }
}