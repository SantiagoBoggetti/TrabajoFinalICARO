package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    private By nombreUsuario = By.xpath("//input[@name='email']");
    private By contrasenaUsuario = By.xpath("//input[@name='password']");
    private By clickSignIn = By.xpath("//input[@class='btn btn-primary']");

    private By camaraClick = By.xpath("//a[@href='http://opencart.abstracta.us:80/index.php?route=product/category&path=33']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void login(String email, String password) {
        WebElement elementNombreUsuario = wait.until(ExpectedConditions.presenceOfElementLocated(nombreUsuario));
        elementNombreUsuario.sendKeys(email);

        WebElement elementContrasenaUsuario = wait.until(ExpectedConditions.presenceOfElementLocated(contrasenaUsuario));
        elementContrasenaUsuario.sendKeys(password);

        WebElement elementClickSignIn = wait.until(ExpectedConditions.elementToBeClickable(clickSignIn));
        elementClickSignIn.click();
    }
    public void clickearCamara() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(camaraClick));
        element.click();
}
}