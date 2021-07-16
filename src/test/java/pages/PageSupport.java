package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageSupport {
    WebDriver driver;

    public PageSupport(WebDriver driver) { this.driver = driver; }

    //  Locator and method for Help portal
    By btnHelpPortal = By.cssSelector(".help-button-container > a[target='_blank'] > input[name='button']");
    public void clickHelpPortal () { driver.findElement(btnHelpPortal).click(); }

    //  Locator and method for Free Demo
    By btnFreeDemo = By.cssSelector("div:nth-of-type(2) > .button-container > a[target='_blank'] > input[name='button']");
    public void clickFreeDemo () { driver.findElement(btnFreeDemo).click(); }

    //  Locator and method for Free Cloud Hosting
    By btnFreeCloudHosting = By.cssSelector("div:nth-of-type(3) > .button-container > a[target='_blank'] > input[name='button']");
    public void clickFreeCloudHosting () { driver.findElement(btnFreeCloudHosting).click(); }

    //  Locator and method for Get it on Google Play button
    By btnGooglePlay = By.cssSelector("a[target='_blank'] > img[alt='Get it on Google Play']");
    public void clickGooglePlay () { driver.findElement(btnGooglePlay).click(); }

    //  locator and method for App Store button
    By btnAppStore = By.cssSelector("a[target='_blank'] > img[alt='Download on the App Store']");
    public void clickAppStore () { driver.findElement(btnAppStore).click(); }
}
