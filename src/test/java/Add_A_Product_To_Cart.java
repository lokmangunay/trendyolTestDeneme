import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Add_A_Product_To_Cart extends BaseTest {

    static final Logger logger = LogManager.getLogger(Add_A_Product_To_Cart.class);

    @Test
    @Order(1)
    public void openTrendyol() {

        Assertions.assertTrue(homePage.isOnHomePage(),
                "trendyol.com is not opened!");
    }
            // Git
    @Test
    @Order(2)
    public void logIn() {
        homePage.goTologInPage();
        logInPage = new LogInPage(driver);
        logInPage.logIn("guneylokman@gmail.com", "lkmngny33");

        homePageAfterLogIn = new HomePageAfterLogIn(driver);
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Hesabım']")));

        Assertions.assertTrue(homePageAfterLogIn.isLoggedIn(),
                "Login failed!.");

        homePageAfterLogIn.search_A_Product(product);
        productsPage = new ProductsPage(driver);


    }

    @Test
    @Order(3)
    public void search_A_Product() {

        logger.info("şimdi patlayacak!!!");
     Assertions.assertTrue(productsPage.isProductSearched(), product + " is not searchced.");
     logger.info("product searched!!!");

    }

    @Test
    @AfterAll
    public void add_A_Product_To_Cart(){
        productsPage = new ProductsPage(driver);     // üstteki method'ta da tanımlamıştım ama hata veriyor burada tanımlamazsam??
   //     int nTh_Product=3;
        productsPage.selectProduct(4);
        logger.info("Switching now!!!");
        productsPage.switchToNewTab();   //asdasdasdasd
        logger.info("Switched!!!");
        productDetailPage=new ProductDetailPage(driver);
        productDetailPage.add_To_Cart();

        productDetailPage.goToCart();


    //   cartPage=new CartPage(driver);

    }
//    @Test
//    @Order(5)
//    public void isProductAddedToCart(){
//        cartPage=new CartPage(driver);
//
//    }

}
