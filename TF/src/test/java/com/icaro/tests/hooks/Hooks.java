package com.icaro.tests.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    private static WebDriver driver;
    private static Properties properties;

    @Before
    public void setUp(Scenario scenario) throws IOException {
        properties = new Properties();
        properties.load(
                new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties" ));

        String browser = properties.getProperty("browser");

        switch (browser) {
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                driver = getFirefoxDriver();
                break;
            default:
                System.out.println("Navegador no disponible");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static Properties getProperties() {
        return properties;
    }

    public WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("--ignore-certificate-errors");

//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
//        options.addArguments("--disable-gpu"); // applicable to windows os only
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model
//        options.addArguments("--headless");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        return new ChromeDriver(options);
    }

    public WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        return null;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}