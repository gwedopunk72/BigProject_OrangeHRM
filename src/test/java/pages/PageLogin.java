package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {
    WebDriver driver;

    //  Constructor that will be automatically called as soon as the object of the class is created
    public PageLogin (WebDriver driver) {
        this.driver = driver;
    }

    //  Locator and method for username field
    By UsernameLogin = By.id("txtUsername");
    public void inputUsername (String username) { driver.findElement(UsernameLogin).sendKeys(username); }

    //  Locator and method for password field
    By PassLogin = By.id("txtPassword");
    public void inputPassword (String password) { driver.findElement(PassLogin).sendKeys(password); }

    //  Locator and method for Login button
    By BtnLogin = By.id("btnLogin");
    public void clickBtnLogin () { driver.findElement(BtnLogin).click(); }

    //  Locator and method for forgot your password button
    By BtnForgotPass = By.linkText("Forgot your password?");
    public void clickBtnForgotPass () { driver.findElement(BtnForgotPass).click(); }

    //  Locator and method for Linkedin button
    By BtnLinkedin = By.cssSelector("img[alt='LinkedIn OrangeHRM group']");
    public void clickBtnLinkedin () { driver.findElement(BtnLinkedin).click(); }

    //  Locator and method for OrangeHRM hyperlink
    By BtnOrangeHRM = By.linkText("OrangeHRM, Inc");
    public void clickBtnOrangeHRM () { driver.findElement(BtnOrangeHRM).click(); }

    //  Locator and method for Facebook button
    By BtnFacebook = By.cssSelector("img[alt='OrangeHRM on Facebook']");
    public void clickBtnFacebook () { driver.findElement(BtnFacebook).click(); }

    //  Locator and method for Twitter button
    By BtnTwitter = By.cssSelector("img[alt='OrangeHRM on twitter']");
    public void clickBtnTwitter () { driver.findElement(BtnTwitter).click(); }

    //  Locator and method for Youtube button
    By BtnYoutube = By.cssSelector("img[alt='OrangeHRM on youtube']");
    public void clickBtnYoutube () { driver.findElement(BtnYoutube).click(); }

    //  Locator and method for username reset password field
    By fieldUserForgot = By.id("securityAuthentication_userName");
    public void inputUserForgot (String username) { driver.findElement(fieldUserForgot).sendKeys(username); }

    //  Locator and method for reset password button
    By BtnResetPass = By.id("btnSearchValues");
    public void clikBtnReset () { driver.findElement(BtnResetPass).click(); }

    //  Locator and method for alternative login button
    By BtnAlterLogin = By.id("openIdProvider");
    public void clickBtnAlternative () { driver.findElement(BtnAlterLogin).click(); }
}
