package shopPragmaticBg.login.positive;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.LoginPage;
import utils.Browser;
import utils.CommonVerifications;

public class SuccessfulLoginTests {
 @BeforeMethod
    public void setUp(){
     Browser.open();
 }
 @Test
 public void successfullyLoginTest() throws InterruptedException {
     HeaderPage.goTo();
     HeaderPage.navigateToLoginpage();
     CommonVerifications.verifyTitle("Account Login", "Error: Go to Account Login page not successful");
     LoginPage.login("mumi@abv.bg","mumi123!");
     CommonVerifications.verifyTitle("My Account","Not successful login");

 }


 @AfterMethod
 public void tearDown(){
     Browser.quit();
 }
}
