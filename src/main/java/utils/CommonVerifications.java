package utils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.testng.Assert.*;


public class CommonVerifications {
    /**
     * Method that verifies the title of the page based on the provided expected title and logs a message in case assert failure
     * @param expectedTitle expected title
     * @param errorMessage error message in case that assert fails
     */
    public static void verifyTitle(String expectedTitle, String errorMessage) {

        String actualTitle = Browser.driver.getTitle();
        WebDriverWait wait= new WebDriverWait(Browser.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains(actualTitle));
           assertEquals(actualTitle,expectedTitle,errorMessage);


    }
}
