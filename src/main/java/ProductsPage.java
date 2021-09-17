import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductsPage extends BasePage {


    public ProductsPage() {
    }

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductSearched() {
       // WebElement product_description = driver.findElement(By.xpath("//h1[text()='Bilgisayar']"));
        WebElement product_description = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[1]/div[1]/div"));
        return product_description.isDisplayed();
    }

    //    public void selectProduct(){
//     By productNameLocator=By.xpath("//*[@class='p-card-chldrn-cntnr']");
//     driver.findElement(productNameLocator).click();
//    }
    public List<WebElement> getAll() {
        By productNameLocator = By.className("prdct-desc-cntnr");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(productNameLocator));

        return driver.findElements(productNameLocator);
    }

    public void selectProduct(int i) {
        getAll().get(i - 1).click();


    }




}

