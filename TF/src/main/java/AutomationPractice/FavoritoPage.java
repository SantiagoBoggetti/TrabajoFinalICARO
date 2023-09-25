package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FavoritoPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    private By validarFavorito  = By.xpath("//td[@class='text-left'][contains(text(), 'Product 3')]");


    public FavoritoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public boolean ValidacionDeFavorito() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(validarFavorito));
        return element.isDisplayed();
    }

    }

