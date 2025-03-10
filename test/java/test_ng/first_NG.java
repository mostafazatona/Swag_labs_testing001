package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class first_NG {
    WebDriver driver2;

    @BeforeTest
    public void setup() {
        driver2 = new FirefoxDriver();
        driver2.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void testSuccessfulLogin() {
        driver2.findElement(By.id("user-name")).sendKeys("standard_user");
        driver2.findElement(By.id("password")).sendKeys("secret_sauce");
        driver2.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));

        String currentUrl = driver2.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html", "Login failed for valid credentials");

    }
    @Test(priority = 2, dependsOnMethods = "testSuccessfulLogin")
    public void testsuccesslogout(){
        driver2.findElement(By.id("react-burger-menu-btn")).click();
        driver2.findElement(By.id("logout_sidebar_link")).click();
    }

    @Test(priority = 3)
    public void testInvalidPassword() {
        driver2.findElement(By.id("user-name")).sendKeys("standard_user");
        driver2.findElement(By.id("password")).sendKeys("secret_sauce1");
        driver2.findElement(By.id("login-button")).click();

        String currentUrl = driver2.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/", "Login succeeded with invalid password");
        driver2.get("https://www.saucedemo.com/");
    }

    @Test(priority = 4)
    public void testInvalidUsername() {
        driver2.findElement(By.id("user-name")).sendKeys("standard_user1");
        driver2.findElement(By.id("password")).sendKeys("secret_sauce");
        driver2.findElement(By.id("login-button")).click();

        String currentUrl = driver2.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/", "Login succeeded with invalid username");
        driver2.get("https://www.saucedemo.com/");
    }

    @Test(priority = 5)
    public void testBlankLogin() {
        driver2.findElement(By.id("user-name")).sendKeys("");
        driver2.findElement(By.id("password")).sendKeys("");
        driver2.findElement(By.id("login-button")).click();

        String currentUrl = driver2.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/", "Login succeeded with blank credentials");
    }

    @AfterTest
    public void tearDown() {
        if (driver2 != null) {
            driver2.quit();
        }
    }
}