package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {


        WebDriver driver;
/*variable*/
        public Products(WebDriver driver) {

            this.driver = driver;
        }

        By Product_Sort = By.className("product_sort_container");
    By chart_icon = By.className("shopping_cart_link");

    /*Inside_BurgerMenue*/
/*locators*/
    By Burger_menu = By.id("react-burger-menu-btn");
    By All_items =By.id("inventory_sidebar_link");
    By About = By.id("about_sidebar_link");
    By logout =By.id("logout_sidebar_link");
    By Reset_App_State =By.id("reset_sidebar_link");
        By Cross_button = By.id("react-burger-cross-btn");

    /*First Product*/
        By SL_Bp_Name = By.xpath("//*[@id=\"item_4_title_link\"]/div");
        By SL_Bp_Image = By.xpath("//*[@id=\"item_4_img_link\"]/img");
        By SL_Bp_Addtocartbutton = By.id("add-to-cart-sauce-labs-backpack");
By SL_Bp_removeproduct1 = By.id("remove-sauce-labs-backpack");
    /*second product*/
        By SL_Bl_Name = By.xpath("//*[@id=\"item_0_title_link\"]/div");
        By SL_Bl_Image = By.xpath("//*[@id=\"item_0_img_link\"]/img");
        By SL_BL_Addtocartbutton2 = By.id("add-to-cart-sauce-labs-bike-light");
    By SL_Bp_removeproduct2 = By.id("remove-sauce-labs-bolt-t-shirt");
    /*Third product*/
        By SL_BT_Name = By.xpath("//*[@id=\"item_1_title_link\"]/div");
        By SL_BT_Image = By.xpath("//*[@id=\"item_1_img_link\"]/img");
        By SL_BT_Addtocartbutton3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By SL_Bp_removeproduct3 = By.id("remove-sauce-labs-onesie");
    /*Fourth product*/
        By SL_FJ_Name = By.xpath("//*[@id=\"item_5_title_link\"]/div");
        By SL_FJ_Image = By.xpath("//*[@id=\"item_5_img_link\"]/img");
        By SL_FJ_Addtocartbutton4 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By SL_Bp_removeproduct4 = By.id("remove-sauce-labs-bike-light");
    /*Fifth product*/
        By SL_Onesie_Name = By.xpath("//*[@id=\"item_2_title_link\"]/div");
        By SL_Onesie_Image = By.xpath("//*[@id=\"item_2_img_link\"]");
        By SL_Onesie_Addtocartbutton5 = By.id("add-to-cart-sauce-labs-onesie");
    By SL_Bp_removeproduct5 = By.id("remove-sauce-labs-fleece-jacket");
  /*Sixth product*/
        By Test_allTheThings_Name = By.xpath("//*[@id=\"item_3_title_link\"]/div");
        By Test_allTheThings_Image = By.xpath("//*[@id=\"item_3_img_link\"]/img");
        By Test_allTheThings_Addtocartbutton6 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By SL_Bp_removeproduct6 = By.id("remove-test.allthethings()-t-shirt-(red)");
        /* footer Items*/
        By Linkedin_icon = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a");
    By Facbook_icon = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a");
    By X_icon =By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a");
/*actions*/
    public void Clicking_Linkedin_icon (By Linkedin) {
        driver.findElement(Linkedin_icon).click();

    }
    public void Clicking_Facbook_icon (By Facbook) {
        driver.findElement( Facbook_icon).click();

    }
    public void Clicking_X_icon(By X) {
        driver.findElement(X_icon).click();

    }
    public void Clicking_About (By about) {
        driver.findElement(About).click();

    }
    public void Clicking_All_items (By all_items) {
        driver.findElement(All_items).click();

    }
    public void Clicking_Burger_menu (By burger_menu) {
        driver.findElement(Burger_menu).click();

    }
    public void Clicking_chart_icon  (By chart) {
        driver.findElement(chart_icon).click();

    }

    public void Clicking_logout_button () {
        driver.findElement(logout).click();

    }
    public void Clicking_Reset_App_State (By Reset) {
        driver.findElement(Reset_App_State).click();

    }
    public void Click_add_prouduct(){
        driver.findElement(SL_Bp_Addtocartbutton).click();
    }
    public String Clicking_remove_product(){
        driver.findElement(SL_Bp_removeproduct1).click();
        return null;
    }
    /*validation*/


}


