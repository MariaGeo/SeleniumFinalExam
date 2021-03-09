package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Browser {
    public static WebDriver driver;

    /**
     * Method that open Chrome browser
     */
    public static void open() {
        System.setProperty("webdriver.chrome.driver","C://webdrivers//chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Method that quit the browser
     */
    public static void quit() {
        driver.quit();
    }
}
