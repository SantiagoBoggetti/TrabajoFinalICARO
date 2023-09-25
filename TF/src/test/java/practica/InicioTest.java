package practica;

import AutomationPractice.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import practica.BaseTest;

public class InicioTest extends BaseTest {


    @Test
    public void IngresarAlInicio() {
        this.driver.get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @Test
    public void ValidarHome() {
        HomePage homePage = new HomePage(getDriver());
        // this.driver.get("http://opencart.abstracta.us/index.php?route=common/home");
        //WebElement logo = this.driver.findElement(By.id("logo"));
        //WebElement accesoAlLoginBtn = this.driver.findElement(By.xpath("//a[@title='My Account']"));

        //Assert.assertTrue(logo.isDisplayed());
        //Assert.assertTrue(accesoAlLoginBtn.isDisplayed());
        Assert.assertTrue(homePage.logoEsVisible() );
        Assert.assertTrue(homePage.accesoLoginEsVisible() );
    }

}
//Dejo los comentarios para que quede el camino realizado
