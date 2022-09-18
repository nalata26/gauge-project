package common;

import driver.setUpSuitUpTearDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
    static WebDriver driver = setUpSuitUpTearDown.driver;
    public static void waitToElenmentVisibility(By xpath, int times){
        WebDriverWait wait = new WebDriverWait(driver,times);
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
    }
    public static void waitToElenmentToClickable(int times, By xpath){
        WebDriverWait wait = new WebDriverWait(driver,times);
        wait.until(ExpectedConditions.elementToBeClickable(xpath));
    }
}
