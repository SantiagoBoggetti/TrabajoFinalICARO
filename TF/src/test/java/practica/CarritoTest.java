package practica;

import AutomationPractice.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarritoTest extends BaseTest {


    @Test
    public void carrito() {
        this.driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        // Espera hasta que el botón "My Account" sea visible y haga clic en él.
        WebElement myAccountBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='My Account']")));
        myAccountBtn.click();

        // Espera hasta que el botón "Login" sea visible y haga clic en él.
        WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/login']")));
        loginBtn.click();

        // Ingresa el nombre de usuario
        WebElement nombreUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        nombreUsuario.sendKeys("santiago@hotmail.com");

        // Ingresa la contraseña del usuario
        WebElement contraseñaUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        contraseñaUsuario.sendKeys("123456");

        // Haz clic en el botón "Sign In"
        WebElement clickSignIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='btn btn-primary']")));
        clickSignIn.click();

        WebElement clickCamera = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://opencart.abstracta.us:80/index.php?route=product/category&path=33']")));
        clickCamera.click();

        WebElement clickCarrito = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@onclick, \"cart.add('30', '1');\")]")));
        clickCarrito.click();

        WebElement selectColor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='input-option226']")));
        selectColor.click();

        WebElement selectRojo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='15' and contains(text(), 'Red')]")));
        selectRojo.click();

        WebElement addCarrito = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='button-cart']")));
        addCarrito.click();

        WebElement irACarrito = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")));
        irACarrito.click();

        WebElement vistaCarrito = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(., 'View Cart')]")));
        vistaCarrito.click();



        WebElement validarcarrito1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='text-left' and text()='Product 3']")));
        Assert.assertTrue(validarcarrito1.isDisplayed());

    }
    @Test
    public void CarritoPOM() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        CamaraPage camaraPage = new CamaraPage(getDriver());
        CarritoPage carritoPage = new CarritoPage(getDriver());


        homePage.accederAlBotonMyAccount();
        homePage.accederAlogin();
        loginPage.login("santiago@hotmail.com", "123456");
        loginPage.clickearCamara();
        camaraPage.agregarAlCarrito();
        carritoPage.carritoEsVisible();


    }


}
