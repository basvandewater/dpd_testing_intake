package com.wartsila.testing.cucumber.steps;

import com.wartsila.testing.cucumber.ui.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Slf4j
public class BasePage {

    WebDriverWait wait;

    public BasePage () {
        PageFactory.initElements(WebDriverManager.getWebDriver(), this);

        wait = new WebDriverWait(WebDriverManager.getWebDriver(), Duration.ofSeconds(30));
    }

    public void open(String url) {
        WebDriverManager.getWebDriver().navigate().to(url);
    }

    public void close() {
        WebDriverManager.getWebDriver().close();
    }

    public void waitFor(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click (WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void type (WebElement element, String text) {
        element.sendKeys(text);
    }
}
