package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    // Holds the WebDriver instance

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver(){
        System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver(){
    }

}
