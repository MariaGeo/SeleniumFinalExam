package shopPragmaticBg.registration.negative;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.RegisterAccountPage;
import utils.Browser;
import utils.CommonVerifications;

public class RegistrationTests {
    @BeforeMethod
    public void setUp(){
        Browser.open();
    }
    @Test
    public void leftEmptyFieldsInRegistrationTest(){
        HeaderPage.goTo();
        HeaderPage.goToRegistrationForm();
        CommonVerifications.verifyTitle("Register Account", "Error: Go to Registration Account page not successful");
        RegisterAccountPage.registration("","","mumi10@abv.bg","","mumi123!");
        RegisterAccountPage.verifyErrorMessageInEmptyFields("Errors not appear");
    }
    @AfterMethod
    public void tearDown(){
        Browser.quit();
    }

}
