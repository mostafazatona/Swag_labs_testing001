package page.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Products;
import pages.login;

import java.time.Duration;

public class log_out_TC extends Base_test  {
    login LP;
    Products logout;


@Test
public void testName() {
    Assert.assertTrue(true, "String message");

}
    public void testlog_out(){
        LP = new login(base_driver);
        logout = new Products(base_driver);
        LP.setusername("standard_user");
        LP.setpassword("password");
        LP.clickonlogin();
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(10));
        logout.Clicking_logout_button();



    }
}
