package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CamaraPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By clickCorazon = By.xpath("//button[contains(@onclick, \"wishlist.add('30')\")]");
    private By wishList = By.xpath("//span[@class='hidden-xs hidden-sm hidden-md' and text()='Wish List (1)']");
    private By clickCarrito1 = By.xpath("//button[contains(@onclick, \"cart.add('30', '1');\")]");
    private By selectColor = By.xpath("//select[@id='input-option226']");
    private By selectRed = By.xpath("//option[@value='15' and contains(text(), 'Red')]");
    private By clickAddCarrito = By.xpath("//button[@id='button-cart']");
    private By clickCarritoUp = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
    private By clickViewCarrito = By.xpath("//strong[contains(., 'View Cart')]");

    public CamaraPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void clickarCorazon() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(clickCorazon));
        element.click();

}
    public void clickarWishList() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wishList));
        element.click();
    }
    public void agregarAlCarrito() {
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(clickCarrito1));
        element1.click();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(selectColor));
        element2.click();
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(selectRed));
        element3.click();
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(clickAddCarrito));
        element4.click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(clickCarritoUp));
        element5.click();
        WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(clickViewCarrito));
        element6.click();
    }

}
