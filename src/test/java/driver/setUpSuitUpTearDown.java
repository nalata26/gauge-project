package driver;

import com.thoughtworks.gauge.*;
import common.loadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class setUpSuitUpTearDown{
    public static WebDriver driver;
    @BeforeSuite
    public void initializeDriver(){
        driver = DriverGenarate.getDriver();
    }

    // Close the webDriver instance
    @AfterSuite
    public void AfterSuite() {
        driver.quit();
    }


    @BeforeSpec(tags = {"browser"})
    public void BeforeSpec() {
        driver.get(loadConfig.getProperties("browser.properties","URL"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterSpec(tags = {"browserClose"})
    public void AfterSpec() {
        driver.close();
    }

}
