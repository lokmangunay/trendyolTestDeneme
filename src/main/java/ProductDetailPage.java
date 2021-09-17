import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage() {
    }

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void add_To_Cart(){
        By addToCartLocator= By.xpath("//*[text()='Sepete Ekle']");
        click(addToCartLocator);

    }


    public void goToCart() {
        By myCartButton=By.xpath("//p[text()='Sepetim']");
        click(myCartButton);
    }
}
