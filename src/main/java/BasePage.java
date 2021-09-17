import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class BasePage {

    WebDriver driver;


    public BasePage() {


    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement find(By locator) {
        return driver.findElement(locator);

    }

    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);

    }

    public void click(By locator) {
        find(locator).click();
    }

    public void type(By locator, String text) {
        find(locator).sendKeys(text);
    }

    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    public void switchToNewTab(){
        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();

        Set<String>s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);

//                System.out.println(driver.switchTo().window(child_window).getTitle());
//
//                driver.close();
            }

        }

      //  driver.switchTo().window(parent);   //switch to the parent window

    }


    }

