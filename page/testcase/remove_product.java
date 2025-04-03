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
import pages.Products;
import pages.login;

import java.time.Duration;
import java.util.List;

public class remove_product extends Base_test {
    login testlogin;
    Products test_product1;
    Cart cart;

    @Test
    public void remove_product() {
        // تهيئة الكائنات اللازمة
        testlogin = new login(base_driver);
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(5));
        test_product1 = new Products(base_driver);
        cart = new Cart(base_driver);

        // تسجيل الدخول
        testlogin.setusername("standard_user");
        testlogin.setpassword("secret_sauce");

        // انتظار زر تسجيل الدخول ليكون قابلاً للنقر ثم النقر عليه
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        testlogin.clickonlogin();

        // إضافة المنتج إلى السلة
        test_product1.Click_add_prouduct();
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));
        cartLink.click();

        // التحقق من وجود المنتج في العربة
        WebElement cartItemName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name']")));
        String cartItemNameText = cartItemName.getText();
        System.out.println("اسم المنتج في العربة: " + cartItemNameText);

        Assert.assertEquals(cartItemNameText, "Sauce Labs Backpack", "اسم المنتج في العربة غير صحيح!");

        // العودة إلى الصفحة الرئيسية وإزالة المنتج
        base_driver.navigate().back(); // العودة إلى الصفحة الرئيسية
        test_product1.Clicking_remove_product();
        System.out.println("تمت إزالة المنتج من الصفحة الرئيسية.");

        // العودة إلى صفحة العربة للتحقق من خلوها
        cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));
        cartLink.click();

        // التحقق من أن العربة فارغة باستخدام findElements
        List<WebElement> cartItems = base_driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        if (cartItems.isEmpty()) {
            System.out.println("العربة فارغة: لا يوجد أي منتجات.");
            Assert.assertTrue(true, "العربة فارغة بنجاح.");
        } else {
            Assert.fail("العربة ليست فارغة! المنتجات الموجودة: " + cartItems.size());
        }
    }
}