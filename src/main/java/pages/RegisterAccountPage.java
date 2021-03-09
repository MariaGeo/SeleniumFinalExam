package pages;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Browser;
import static org.testng.Assert.*;

public class RegisterAccountPage {
    private static final By LOC_FIRST_NAME_FIELD= By.id("input-firstname");
    private static final By LOC_LAST_NAME_FIELD= By.id("input-lastname");
    private static final By LOC_EMAIL_FIELD= By.id("input-email");
    private static final By LOC_TELEPHONE_FIELD=By.id("input-telephone");
    private static final By LOC_PASSWORD_FIELD = By.id("input-password");
    private static final By LOC_PASSWORD_CONFIRM_FIELD=By.id("input-confirm");
    private static final By LOC_NEWSLETTER_YES_SUBSCRIBE=By.xpath("//input[@name=\"newsletter\"][@value=\"1\"]");
    private static final By LOC_PRIVACY_POLICY_AGREE= By.xpath("//input[@name=\"agree\"]");
    private static final By LOC_CONTINUE_BUTTON= By.xpath("//input[@value=\"Continue\"]");
    private static final By LOC_HAS_ERROR_MESSAGE_IN_LEFT_EMPTY_SPACES= By.xpath("//div[@class=\"form-group required has-error\"]");

    /**
     * Method that make account registration based on the  given info
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param email the email of the user
     * @param telephone telephone number of the user
     * @param password password about the account
     */
    public static void registration(String firstName, String lastName, String email, String telephone, String password) {
       Browser.driver.findElement(LOC_FIRST_NAME_FIELD).sendKeys(firstName);
        Browser.driver.findElement(LOC_LAST_NAME_FIELD).sendKeys(lastName);
        Browser.driver.findElement(LOC_EMAIL_FIELD).sendKeys(email);
        Browser.driver.findElement(LOC_TELEPHONE_FIELD).sendKeys(telephone);
        Browser.driver.findElement(LOC_PASSWORD_FIELD).sendKeys(password);
        Browser.driver.findElement(LOC_PASSWORD_CONFIRM_FIELD).sendKeys(password);
        WebElement newsletterYesSubscribe = Browser.driver.findElement(LOC_NEWSLETTER_YES_SUBSCRIBE);
        if (!newsletterYesSubscribe.isSelected()){
            newsletterYesSubscribe.click();
        }

        WebElement privacyPolicyAgree = Browser.driver.findElement(LOC_PRIVACY_POLICY_AGREE);
        if (!privacyPolicyAgree.isSelected()) {
            privacyPolicyAgree.click();
        }

        Browser.driver.findElement(LOC_CONTINUE_BUTTON).click();


    }

    /**
     * Method that verifies if appear errors message about empty fields
     * @param error  the error that there wasn't error messages about empty fields
     */
    public static void verifyErrorMessageInEmptyFields(String error) {
        WebElement errorMessage = Browser.driver.findElement(LOC_HAS_ERROR_MESSAGE_IN_LEFT_EMPTY_SPACES);
        assertTrue(errorMessage.isDisplayed(), error);
    }
}
