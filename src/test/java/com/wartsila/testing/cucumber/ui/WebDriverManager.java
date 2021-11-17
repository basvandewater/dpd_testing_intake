package com.wartsila.testing.cucumber.ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverManager {
    private static RemoteWebDriver webDriver;

    public static RemoteWebDriver getWebDriver() {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            webDriver = new ChromeDriver(new ChromeOptions());
        }

        return webDriver;
    }
}
