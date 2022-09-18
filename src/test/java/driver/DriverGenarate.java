package driver;

import common.loadConfig;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverGenarate {


    public static WebDriver getDriver() {
        String browser = loadConfig.getProperties("browser.properties", "BROWSER");

        switch (browser) {
            case "Android":
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("device","");
                capabilities.setCapability("app","");
            case "IE":
                System.setProperty("webdriver.ie.driver", "driver/msedgedriver.exe");
                return new InternetExplorerDriver();
//                WebDriverManager.iedriver().setup();
//                return new InternetExplorerDriver();
            case "FIREFOX":
                System.setProperty("webdriver.ie.driver", "driver/chromedriver.exe");
                return new FirefoxDriver();
            case "CHROME":
            default:
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
                return new ChromeDriver();
        }

    }
}

