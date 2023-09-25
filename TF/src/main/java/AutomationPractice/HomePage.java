package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By logo = By.id("logo");
    private By accesoAlLoginBtn = By.xpath("//span[@class='caret']");
    private By accesoALogin = By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/login']");
    private By accesoAlRegistro = By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/register']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean logoEsVisible() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(logo));
        return element.isDisplayed();
    }

    public boolean accesoLoginEsVisible() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(accesoAlLoginBtn));
        return element.isDisplayed();
    }

    public void accederAlBotonMyAccount() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(accesoAlLoginBtn));
        element.click();
    }

    public void accederAlogin() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(accesoALogin));
        element.click();
    }

    public void accederAlRegistro() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(accesoAlRegistro));
        element.click();
    }
    public void abrirPagina(String url) {
        this.driver.get(url);
    }
}