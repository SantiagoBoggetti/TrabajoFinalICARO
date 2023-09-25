package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By validacionUsuario = By.id("content");

    public UserPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean validacionUsuarioEsVisible() {
        WebElement elementValidacionUsuario = wait.until(ExpectedConditions.presenceOfElementLocated(validacionUsuario));
        return elementValidacionUsuario.isDisplayed();
    }
}