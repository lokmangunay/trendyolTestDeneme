import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LogInPage extends BasePage{
    public LogInPage() {
    }

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    private By emailLocator = By.xpath("//input[@id='login-email']");
    private By passwordLocator = By.id("login-password-input");
    private By logInButtonLocator = By.className("submit");
    WebElement emailInputBox = driver.findElement(emailLocator);
    WebElement passwordInputBox = driver.findElement(passwordLocator);
    WebElement logInButton = driver.findElement(logInButtonLocator);

    public void logIn(String email, String password) {

        click(emailLocator);
        emailInputBox.sendKeys(email);
        click(passwordLocator);
        passwordInputBox.sendKeys(password);
         click(logInButtonLocator);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
