package org.betterplace.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    private static WebDriver driverPool;
    public static WebDriver get() {
        if (driverPool == null) {
            String browser = ConfigurationReader.getValue("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool = new ChromeDriver();
                    break;

                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driverPool = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool = new FirefoxDriver();
                    break;

                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }
        }

        return driverPool;
    }
    public static void closeDriver() {
        if (driverPool != null) {
            driverPool.quit();
            driverPool = null;
        }
    }
}