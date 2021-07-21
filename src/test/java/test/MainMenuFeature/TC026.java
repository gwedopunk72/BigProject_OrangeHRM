package test.MainMenuFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC026 extends TC00 {

    /**
     * [TC026] Dashboard check My leave list
     */

    @Test
    public void DashboardCheckMyLeaveList() throws InterruptedException {

        dashboard.clickMenuDashboard();
        dashboard.clickMenuMyLeave();
        Thread.sleep(2000);

        // Date picker start date
        dashboard.clickStartCalendar();
        Thread.sleep(2000);
        Select startMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        startMonth.selectByValue("0");
        Thread.sleep(2000);

        Select startYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
        startYear.selectByValue("2017");
        Thread.sleep(2000);

        dashboard.selectStartDate();
        Thread.sleep(2000);

        // Date picker finish date
        dashboard.clickFinishCalendar();
        Thread.sleep(2000);

        Select finiMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        finiMonth.selectByValue("5");
        Thread.sleep(2000);

        Select finiYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
        finiYear.selectByValue("2020");
        Thread.sleep(2000);

        dashboard.selectFinishDate();
        Thread.sleep(2000);

        // Select radio status
        dashboard.selRadioAll();

        dashboard.clickBtnSearcH();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("No Records Found"));


    }
}