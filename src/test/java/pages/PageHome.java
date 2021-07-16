package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHome {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public PageHome (WebDriver driver) {
        this.driver = driver;
    }

    //  Locator and method for about profile
    By menuAbout = By.xpath("/html//a[@id='aboutDisplayLink']");
    public void clickMenuAbout () { driver.findElement(menuAbout).click(); }

    //  Locator and method for user profile button
    By menuProfile = By.id("welcome");
    public void clickMenuProfile () { driver.findElement(menuProfile).click(); }

    //  Locator and method for change password menu
    By menuSupport = By.cssSelector("div#welcome-menu > ul > li:nth-of-type(2) > a");
    public void clickMenuChangepass () { driver.findElement(menuSupport).click(); }

    //  Locator and method for logout button
    By menuLogout = By.linkText("Logout");
    public void clickMenuLogout () { driver.findElement(menuLogout).click(); }
}
