package practica;

import AutomationPractice.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import practica.BaseTest;

public class FavoritoTest extends BaseTest {



    @Test
    public void favorito() {
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

        WebElement clickCorazon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@onclick, \"wishlist.add('30')\")]")));
        clickCorazon.click();

        WebElement wishList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='wish list' and @href='http://opencart.abstracta.us:80/index.php?route=account/wishlist'] ")));
        wishList.click();


        // Espera hasta que el enlace "Canon EOS 5D" sea visible para validar que se agregó a favoritos
        WebElement validarFavoritos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='text-left'][contains(text(), 'Product 3')]")));
        Assert.assertTrue(validarFavoritos.isDisplayed());
    }

    @Test
    public void FavoritoPOM() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        CamaraPage camaraPage = new CamaraPage(getDriver());
        FavoritoPage favoritoPage = new FavoritoPage(getDriver());

        homePage.accederAlBotonMyAccount();
        homePage.accederAlogin();

        loginPage.login("santiago@hotmail.com", "123456");
        loginPage.clickearCamara();
        camaraPage.clickarCorazon();
        camaraPage.clickarWishList();
        favoritoPage.ValidacionDeFavorito();

    }

}