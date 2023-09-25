package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarritoPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By CarritoVisible = By.xpath("//td[@class='text-left' and text()='Product 3']");

    public CarritoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
}
    public boolean carritoEsVisible() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(CarritoVisible));
        return element.isDisplayed();
    }
}