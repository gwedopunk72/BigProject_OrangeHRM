package test.MainMenuFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.PageChangePassword;
import pages.PageHome;
import pages.PageLogin;
import pages.PageSupport;
import pages.PageDirectory;
import pages.PageDashboard;

public class TC00 {
    static WebDriver driver = new ChromeDriver();

    //  Creating page object

    PageLogin login = new PageLogin(driver);
    PageHome home = new PageHome(driver);
    PageSupport support = new PageSupport(driver);
    PageChangePassword changepass = new PageChangePassword(driver);
    PageDirectory directory = new PageDirectory(driver);
    PageDashboard dashboard = new PageDashboard(driver);

    @BeforeTest
    public void initialize() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

}


