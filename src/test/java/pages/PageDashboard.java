package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageDashboard {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public PageDashboard (WebDriver driver) {
        this.driver = driver;
    }

    //  Locator and method for Dashboard menu
    By menuDashboard = By.id("menu_dashboard_index");
    public void clickMenuDashboard () { driver.findElement(menuDashboard).click(); }

    // Locator and method for Assign Leave
    By menuAssLeave = By.linkText("Assign Leave");
    public void clickMenuAssLeave () { driver.findElement(menuAssLeave).click(); }

    // Locator and method for Leave List
    By menuLeaveList = By.linkText("Leave List");
    public void clickMenuLeaveList () { driver.findElement(menuLeaveList).click(); }

    // Locator and method for start calendar
    By startCalendar = By.id("calFromDate");
    public void clickStartCalendar () { driver.findElement(startCalendar).click(); }

    // Locator and method for start date picker
    By StartDate = By.linkText("2");
    public void selectStartDate () { driver.findElement(StartDate).click(); }

    // Locator and method for finish date picker
    By finishDate = By.linkText("30");
    public void selectFinishDate () { driver.findElement(finishDate).click(); }

    // Locator and method for finish calendar
    By finishCalendar = By.id("calToDate");
    public void clickFinishCalendar () { driver.findElement(finishCalendar).click(); }

    // Locator and method for employee name
    By employeeField = By.id("leaveList_txtEmployee_empName");
    public void inputEmployeeField (String name) { driver.findElement(employeeField).sendKeys(name); }

    // Locator and method for radio include past employee
    By radioPastEmploye = By.id("leaveList_cmbWithTerminated");
    public void selectRadioPastEmploye () { driver.findElement(radioPastEmploye).click(); }

    // locator and method for btn search
    By btnSearcH = By.id("btnSearch");
    public void clickBtnSearcH () { driver.findElement(btnSearcH).click(); }

    // Locator and method for radio All
    By radioAll = By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck");
    public void selRadioAll () { driver.findElement(radioAll).click(); }

    // Locator and method Timesheets
    By menuTimesheets = By.linkText("Timesheets");
    public void clickMenuTimesheets () { driver.findElement(menuTimesheets).click(); }

    // Locator and method field employee
    By timeEmployee = By.id("employee");
    public void inputTimeEmployee (String name) { driver.findElement(timeEmployee).sendKeys(name); }

    By fieldEmploye = By.id("employee");
    public void clickFieldEmploye () { driver.findElement(fieldEmploye).click(); }

    // Locator and method for btn btnView
    By btnView = By.id("btnView");
    public void clickbtnView () { driver.findElement(btnView).click(); }

    // Locator and method for Apply Leave
    By menuApplyLeave = By.linkText("Apply Leave");
    public void clickMenuApplyLeave () { driver.findElement(menuApplyLeave).click(); }

    // Locator and method for My Leave status
    By menuMyLeave = By.linkText("My Leave");
    public void clickMenuMyLeave () { driver.findElement(menuMyLeave).click(); }

    // Locator and method for My Timesheet
    By menuMyTimesheet = By.linkText("My Timesheet");
    public void clickMenuMyTimesheet () { driver.findElement(menuMyTimesheet).click(); }
}
