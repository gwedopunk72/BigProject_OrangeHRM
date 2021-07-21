package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageDirectory {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public PageDirectory(WebDriver driver) {
        this.driver = driver;
    }

    // Locator and method for Directory menu
    By menuDirectory = By.id("menu_directory_viewDirectory");
    public void clikMenuDirectory () { driver.findElement(menuDirectory).click(); }

    // Locator and method for field name
    By fieldNameDir = By.id("searchDirectory_emp_name_empName");
    public void inputFieldNameDir (String nama) { driver.findElement(fieldNameDir).sendKeys(nama); }

    // Locator amd method for search button
    By btnSearchDir = By.id("searchBtn");
    public void clickBtnSearchDir () { driver.findElement(btnSearchDir).click(); }

    }
