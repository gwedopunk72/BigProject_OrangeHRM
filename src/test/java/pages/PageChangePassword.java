package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageChangePassword {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public PageChangePassword (WebDriver driver) {
        this.driver = driver;
    }

    // Locator and method for current password field
    By fieldCurrentPass = By.id("changeUserPassword_currentPassword");

    public void InputCurrentPass (String password) { driver.findElement(fieldCurrentPass).sendKeys(password); }

    // locator and method for new password field
    By fieldNewPass = By.id("changeUserPassword_newPassword");
    public void InputNewPass (String password) { driver.findElement(fieldNewPass).sendKeys(password); }

    // Locator and method for confirm new password field
    By fieldConNewPass = By.id("changeUserPassword_confirmNewPassword");
    public void InputConNewPass (String password) { driver.findElement(fieldConNewPass).sendKeys(password); }

    // Locator and method for button save
    By bttnSave = By.id("btnSave");
    public void ClickBttnSave () { driver.findElement(bttnSave).click(); }

    // Locator and method for button cancel
    By bttnCancel = By.id("btnCancel");
    public void ClickBttnCancel () { driver.findElement(bttnCancel).click(); }



}
