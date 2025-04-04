package page.testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.Cart;
import pages.Products;
import pages.information;
import pages.login;

import java.time.Duration;
public class Add_prouduct extends Base_test {
    login testlogin;
    Products test_product1;

    Cart cart;

   @Test
    public void Add_prouduct() {
        testlogin = new login(base_driver);
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(5));
        test_product1 =new Products(base_driver);
       cart = new Cart(base_driver);

       testlogin.setusername("standard_user");  // يجب تصحيح "standard_user"
       testlogin.setpassword("secret_sauce");

       // انتظار زر الlogin ليكون قابلاً للنقر ثم النقر عليه
       WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
       testlogin.clickonlogin();

        test_product1.Click_add_prouduct();
       WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));
       cartLink.click();
       WebElement cartItemName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name']")));
       String cartItemNameText = cartItemName.getText();
       System.out.println("اسم المنتج في العربة: " + cartItemNameText);

       Assert.assertEquals("test_product1","test_product1");


    }
    @Test
    public void Addtocart_SLB(){
        testlogin = new login(base_driver);
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(5));
        test_product1 =new Products(base_driver);
        cart = new Cart(base_driver);

        testlogin.setusername("standard_user");  // يجب تصحيح "standard_user"
        testlogin.setpassword("secret_sauce");

        // انتظار زر الlogin ليكون قابلاً للنقر ثم النقر عليه
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        testlogin.clickonlogin();



    }



}
