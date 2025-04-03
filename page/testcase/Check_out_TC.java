
package page.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Cart;
import pages.information;
import pages.login;

import java.time.Duration;

public class Check_out_TC extends Base_test {
    information test_ch_out;
    Cart cart;
    login testlogin;

    /*valid senario*/
    @Test
    public void check_out_info() {
        test_ch_out = new information(base_driver);
        testlogin = new login(base_driver);
        cart = new Cart(base_driver);

        // تعريف WebDriverWait مع مدة انتظار 10 ثوانٍ
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(10));

        // تسجيل الدخول
        testlogin.setusername("standard_user");  // يجب تصحيح "standard_user"
        testlogin.setpassword("secret_sauce");

        // انتظار زر الlogin ليكون قابلاً للنقر ثم النقر عليه
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        testlogin.clickonlogin();

        // إضافة العناصر للسلة مع انتظار ظهور الأزرار
        WebElement addBackpack = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        addBackpack.click();

        WebElement addTshirt = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
        addTshirt.click();

        // الانتقال للسلة مع انتظار زر السلة
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));
        cartLink.click();

        // النقر على زر checkout مع انتظار
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
        checkoutButton.click();

        // إدخال بيانات المعلومات
        test_ch_out.setfirst_name("salma");
        test_ch_out.setlast_name("abdelatty");
        test_ch_out.setpostal_code("12653");

        // انتظار زر continue ثم النقر عليه
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
        test_ch_out.continue_click();

        // التحقق من الـ URL بعد الانتظار للتأكد من اكتمال التحميل
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/checkout-step-two.html"));
        String curl = base_driver.getCurrentUrl();
        Assert.assertEquals(curl, "https://www.saucedemo.com/checkout-step-two.html");
    }
}

    /*
    @Test
    public void check_out_info() {
        test_ch_out = new information(base_driver);
        testlogin = new login(base_driver);
        cart = new Cart(base_driver);

        // تعريف WebDriverWait مع مدة انتظار 10 ثوانٍ
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(10));

        // تسجيل الدخول
        testlogin.setusername("standard_user");  // يجب تصحيح "standard_user"
        testlogin.setpassword("secret_sauce");

        // انتظار زر الlogin ليكون قابلاً للنقر ثم النقر عليه
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        testlogin.clickonlogin();

        // إضافة العناصر للسلة مع انتظار ظهور الأزرار
        WebElement addBackpack = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        addBackpack.click();

        WebElement addTshirt = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
        addTshirt.click();

        // الانتقال للسلة مع انتظار زر السلة
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));

    }
}
 /* @BeforeTest
  public void beforecless(){
      base_driver=new FirefoxDriver();
      base_driver.get("https://www.saucedemo.com/");
      base_driver.findElement(By.id("user-name")).sendKeys("standard_user1");
      base_driver.findElement(By.id("password")).sendKeys("secret_sauce");
      base_driver.findElement(By.id("login-button")).click();
      base_driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
      base_driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
      base_driver.findElement(By.className("shopping_cart_link")).click();


  }
   Assert.assertEquals("Sauce Labs Backpack","Sauce Labs Backpack");

      base_driver.findElement(By.id("first-name")).sendKeys("salma");
      base_driver.findElement(By.id("last-name")).sendKeys("salma");
      base_driver.findElement(By.id("postal-code")).sendKeys("salma");
      base_driver.findElement(By.id("continue")).click();
      Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html","https://www.saucedemo.com/checkout-step-two.html");


}
package page.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Cart;
import pages.information;
import pages.login;

import java.time.Duration;

public class Check_out_TC extends Base_test {
    information test_ch_out;
    Cart cart;
    login testlogin;

    @Test
    public void check_out_info() {
        test_ch_out = new information(base_driver);
        testlogin = new login(base_driver);
        cart = new Cart(base_driver);

        // تعريف WebDriverWait مع مدة انتظار 10 ثوانٍ
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(10));

        // تسجيل الدخول
        testlogin.setusername("stander_user");  // يجب تصحيح "standard_user"
        testlogin.setpassword("secret_sauce");

        // انتظار زر الlogin ليكون قابلاً للنقر ثم النقر عليه
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        testlogin.clickonlogin();

        // إضافة العناصر للسلة مع انتظار ظهور الأزرار
        WebElement addBackpack = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        addBackpack.click();

        WebElement addTshirt = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
        addTshirt.click();

        // الانتقال للسلة مع انتظار زر السلة
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));
        cartLink.click();

        // النقر على زر checkout مع انتظار
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
        checkoutButton.click();

        // إدخال بيانات المعلومات
        test_ch_out.setfirst_name("salma");
        test_ch_out.setlast_name("abdelatty");
        test_ch_out.setpostal_code("12653");

        // انتظار زر continue ثم النقر عليه
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
        test_ch_out.continue_click();

        // التحقق من الـ URL بعد الانتظار للتأكد من اكتمال التحميل
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/checkout-step-two.html"));
        String curl = base_driver.getCurrentUrl();
        Assert.assertEquals(curl, "https://www.saucedemo.com/checkout-step-two.html");
    }
}
*/