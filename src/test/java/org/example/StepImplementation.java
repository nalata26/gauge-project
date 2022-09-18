package org.example;

import com.thoughtworks.gauge.Step;
import common.action;
import driver.DriverGenarate;
import driver.setUpSuitUpTearDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation{
    @Step("Input <text> into textbox have <xpath>")
    public void inputText( String text, String xpath) {
        action.sendkyes(text,xpath);
    }
    @Step("Click on element have <xpath>")
    public void click( String xpath)   {
        action.click(xpath);
    }
    @Step("Sleep 5s")
    public void sleep() throws InterruptedException {
        Thread.sleep(5);
    }
}