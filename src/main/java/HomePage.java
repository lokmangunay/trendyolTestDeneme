import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTologInPage() {

        WebElement popUpExitButton = driver.findElement(By.id("Rating-Review"));
        popUpExitButton.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement logInButtonHomePage = driver.findElement(By.xpath("//p[text()='Giriş Yap']"));

        logInButtonHomePage.click();
    }

    public boolean isOnHomePage() {
        WebElement logInButtonHomePage = driver.findElement(By.xpath("//p[text()='Giriş Yap']"));
        return logInButtonHomePage.isDisplayed();
    }

}
