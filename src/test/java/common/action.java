package common;

import driver.setUpSuitUpTearDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class action {
    static WebDriver driver = setUpSuitUpTearDown.driver;
//
    public static void click(String xpath) {
        wait.waitToElenmentToClickable(20,By.xpath(xpath));
        driver.findElement(By.xpath(xpath)).click();
    }
    public static void sendkyes( String text, String xpath) {
        wait.waitToElenmentVisibility(By.xpath(xpath),20);
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
}
