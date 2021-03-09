package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

import java.time.Duration;

public class HeaderPage {

    private static final By LOC_MY_ACCOUNT_BUTTON= By.xpath("//div[@id=\"top-links\"]//i[@class=\"fa fa-user\"]//following-sibling::span[@class=\"hidden-xs hidden-sm hidden-md\"]");
    private static final By LOC_REGISTER_ACCOUNT_BUTTON= By.xpath("//div[@id=\"top-links\"]//a[contains(@href, \"account/register\")]");
    private static final By LOC_LOGIN_ACCOUNT_BUTTON= By.xpath("//div[@id=\"top-links\"]//a[contains(@href, \"account/login\")]");

    /**
     * Method that go to the front end of a website: http://shop.pragmatic.bg/
     */
    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    /**
     * Method that navigate to the registration form
     */
    public static void goToRegistrationForm() {
        Browser.driver.findElement(LOC_MY_ACCOUNT_BUTTON).click();
        Browser.driver.findElement(LOC_REGISTER_ACCOUNT_BUTTON).click();
    }

    /**
     * Method that navigate to the Login page
     */
    public static void navigateToLoginpage() {
        Browser.driver.findElement(LOC_MY_ACCOUNT_BUTTON).click();
        Browser.driver.findElement(LOC_LOGIN_ACCOUNT_BUTTON).click();

    }
}
