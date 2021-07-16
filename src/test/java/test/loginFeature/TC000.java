package test.loginFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.PageChangePassword;
import pages.PageHome;
import pages.PageLogin;
import pages.PageSupport;

public class TC000 {
    static WebDriver driver = new ChromeDriver();

    //  Creating page object

    PageLogin login = new PageLogin(driver);
    PageHome home = new PageHome(driver);
    PageSupport support = new PageSupport(driver);
    PageChangePassword changepass = new PageChangePassword(driver);

    @BeforeTest
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
}
