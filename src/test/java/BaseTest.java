import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest{

    WebDriver driver;
    HomePage homePage;
    LogInPage logInPage;
    HomePageAfterLogIn homePageAfterLogIn;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    String product = "bilgisayar";

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        homePage=new HomePage(driver);
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

    }

//    @AfterAll
//    public void tearDown(){
//        driver.quit();
//    }



}
