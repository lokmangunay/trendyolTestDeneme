import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAfterLogIn extends BasePage {
    public HomePageAfterLogIn() {
    }

    public HomePageAfterLogIn(WebDriver driver) {
        super(driver);
    }


    public boolean isLoggedIn(){
        WebElement logInButtonHomePage = driver.findElement(By.xpath("//p[text()='Hesabım']"));
        return logInButtonHomePage.isDisplayed();
    }

    public void search_A_Product(String product){
        WebElement searchbox=driver.findElement(By.className("search-box"));
        searchbox.click();
        searchbox.sendKeys(product);
       searchbox.sendKeys(Keys.ENTER);
    }




}
