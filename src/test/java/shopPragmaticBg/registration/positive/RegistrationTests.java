package shopPragmaticBg.registration.positive;


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
    public void registrationWithValidCredentialsTest (){
      HeaderPage.goTo();
      HeaderPage.goToRegistrationForm();
      CommonVerifications.verifyTitle("Register Account", "Error: Go to Registration Account page not successful");
      RegisterAccountPage.registration("Mumi","Mumi","mumi3@abv.bg","0897777777","mumi123!");
      CommonVerifications.verifyTitle("Registered", "Not succesfull registration");



    }
    @AfterMethod
    public void tearDown(){
        Browser.quit();
    }

}
