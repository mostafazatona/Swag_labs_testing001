package page.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Products;
import pages.login;

import java.time.Duration;

public class log_out_TC extends Base_test {
    login LP;
    Products logout;
    Products burger_menu;

    @Test
    public void testlog_out() throws InterruptedException { // إضافة throws InterruptedException
        LP = new login(base_driver);
        logout = new Products(base_driver);
        burger_menu = new Products(base_driver); // تهيئة burger_menu
        // تسجيل الدخول باستخدام بيانات المستخدم
        LP.setusername("standard_user");
        LP.setpassword("secret_sauce");
        LP.clickonlogin();

        // تعريف WebDriverWait للاستخدامات الأخرى إذا لزم الأمر
        Wait<WebDriver> wait = new WebDriverWait(base_driver, Duration.ofSeconds(10));

        // فتح قائمة البرجر
        burger_menu.Clicking_burger_menu();

        // انتظار لمدة 20 ثانية بعد انتهاء حالة الاختبار
        Thread.sleep(20000); // 20000 ميلي ثانية = 20 ثانية
        // النقر على زر تسجيل الخروج
        logout.Clicking_logout_button();

    }
}