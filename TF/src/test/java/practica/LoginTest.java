package practica;

import AutomationPractice.HomePage;
import AutomationPractice.LoginPage;
import AutomationPractice.MyAccountPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        this.driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        // Espera hasta que el botón "My Account" sea visible y haga clic en él.
        //WebElement myAccountBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='My Account']")));
        //myAccountBtn.click();

        // Espera hasta que el botón "Login" sea visible y haga clic en él.
        //WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/login']")));
        //loginBtn.click();

        // Ingresa el nombre de usuario
        //WebElement nombreUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        //nombreUsuario.sendKeys("santiago@hotmail.com");

        // Ingresa la contraseña del usuario
        //WebElement contraseñaUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        //contraseñaUsuario.sendKeys("123456");

        // Haz clic en el botón "Sign In"
        //WebElement clickSignIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='btn btn-primary']")));
        //clickSignIn.click();

        // Espera hasta que el enlace "Checkout" sea visible para validar el inicio de sesión
        //WebElement validarLogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Checkout")));
       // Assert.assertTrue(validarLogIn.isDisplayed());
    }

    @Test
    public void loginCorrecto() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        homePage.accederAlBotonMyAccount();
        homePage.accederAlogin();

        loginPage.login("santiago@hotmail.com", "123456");

        myAccountPage.validarLogIn();
    }
}











