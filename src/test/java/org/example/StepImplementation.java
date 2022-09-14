package org.example;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {
//    @Step("Go to Gauge Get Started Page")
//    public void gotoGetStartedPage() throws InterruptedException {
//        WebElement getStartedButton = Driver.webDriver.findElement(By.xpath("//a[@href='https://docs.gauge.org/getting_started/installing-gauge.html']"));
//        getStartedButton.click();
//
//        Gauge.writeMessage("Page title is %s", Driver.webDriver.getTitle());
//    }
//
//    @Step("Ensure installation instructions are available")
//    public void ensureInstallationInstructionsAreAvailable() throws InterruptedException {
//        WebElement instructions = Driver.webDriver.findElement(By.xpath("//a[@href='/writing-specifications.html']"));
//        assertThat(instructions).isNotNull();
//    }

    @Step("Open the <urlOfWebsite> homepage")
    public void openBrowser(String urlOfWebsite) {
        WebDriver driver =new ChromeDriver();
        driver.get(urlOfWebsite);
    }
}
