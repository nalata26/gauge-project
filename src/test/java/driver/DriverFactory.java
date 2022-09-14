package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    public static WebDriver getDriver() {

        String browser = System.getenv("BROWSER");
//        browser = (browser == null) ? "CHROME": browser;

        switch (browser) {
            case "IE":
                System.setProperty("webdriver.ie.driver","/driver/msedgedriver.exe");
                return new InternetExplorerDriver();
//                WebDriverManager.iedriver().setup();
//                return new InternetExplorerDriver();
            case "FIREFOX":
                System.setProperty("webdriver.ie.driver","/driver/chromedriver.exe");
                return new FirefoxDriver();
            case "CHROME":
            default:
                System.setProperty("webdriver.chrome.driver","/driver/chromedriver.exe");
                return new ChromeDriver();
        }
    }
}
