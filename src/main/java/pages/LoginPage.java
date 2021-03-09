package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class LoginPage {
    private static final By LOC_EMAIL_FIELD= By.id("input-email");
    private static final By LOC_PASSWORD_FIELD= By.id("input-password");
    private static final By LOC_LOGIN_BUTTON= By.xpath("//input[@value=\"Login\"]");

    /**
     * Method that login the user based on email and password
     * @param email email of the user
     * @param password password of the user
     */
    public static void login(String email, String password) {
        Browser.driver.findElement(LOC_EMAIL_FIELD).sendKeys(email);
        Browser.driver.findElement(LOC_PASSWORD_FIELD).sendKeys(password);
        Browser.driver.findElement(LOC_LOGIN_BUTTON).click();
    }
}
