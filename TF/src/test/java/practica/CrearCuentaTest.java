package practica;

import AutomationPractice.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import practica.BaseTest;

public class CrearCuentaTest extends BaseTest {




    @Test
    //public void crearCuenta() {
      //  this.driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        // Espera hasta que el botón "My Account" sea visible y haga clic en él.
       // WebElement myAccountBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='My Account']")));
        //myAccountBtn.click();

        // Espera hasta que el botón "Register" sea visible y haga clic en él.
        //WebElement registerBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[@href=\"https://opencart.abstracta.us:443/index.php?route=account/register\"] ")));
        //registerBtn.click();

        //WebElement nombreRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname")));
        //nombreRegistro.sendKeys("Pepito");

        //WebElement apellidoRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-lastname")));
        //apellidoRegistro.sendKeys("Pedrito");

        //WebElement mailRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
        //mailRegistro.sendKeys("Pepito@qester.com");

        //WebElement telefonoRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-telephone")));
        //telefonoRegistro.sendKeys("2616665445");

        //WebElement contrasenaRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
        //contrasenaRegistro.sendKeys("123456");

        //WebElement contrasena2Registro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-confirm")));
        //contrasena2Registro.sendKeys("123456");

        //WebElement checkRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='agree']")));
        //checkRegistro.click();

        //WebElement registroBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
        //registroBtn.click();

        //WebElement validarRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));

        //Assert.assertTrue(validarRegistro.isDisplayed());


        public void crearCuentaPOM() {
            HomePage homePage = new HomePage(getDriver());
            MyAccountPage myAccountPage = new MyAccountPage(getDriver());
            UserPage UserPage = new UserPage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());

            homePage.accederAlBotonMyAccount();
            homePage.accederAlRegistro();

           registerPage.Registracion("santi", "peres", "santi@tomba.com", "4248991", "123456");

            Assert.assertTrue(UserPage.validacionUsuarioEsVisible());





    }

}




