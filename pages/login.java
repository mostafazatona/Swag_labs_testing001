package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    /*variables*/
    WebDriver driver;

    public login(WebDriver driver) {
        this.driver = driver;
    }
/*locators*/


    By username = By.id("user-name");
    By passwordfield = By.id("password");
    By log_bty = By.id("login-button");

    /*actions*/
        public void setusername (String user_name){
       driver.findElement(username).sendKeys(user_name);

        }
        public void setpassword(String password) {
            driver.findElement(passwordfield).sendKeys(password);
        }
        public void clickonlogin(){
driver.findElement(log_bty).click();


}
}