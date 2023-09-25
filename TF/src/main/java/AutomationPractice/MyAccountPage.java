package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public By validarelLogIn = By .xpath("//h2[text() = 'My Account']");


    public MyAccountPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean validarLogIn() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(validarelLogIn));
        return element.isDisplayed();
    }


}
