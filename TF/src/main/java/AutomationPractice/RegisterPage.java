package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By nombreRegistro = By.id("input-firstname");
    private By apellidoRegistro = By.id("input-lastname");
    private By mailRegistro = By.id("input-email");
    private By telefonoRegistro = By.id("input-telephone");
    private By contrasenaRegistro = By.id("input-password");
    private By contrasena2Registro = By.id("input-confirm");
    private By checkRegistro = By.xpath("//input[@name='agree']");
    private By registroBtn = By.xpath("//input[@type='submit']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void Registracion(String nombre, String apellido, String mail, String telefono, String contrasena) {
        // Comentario: Espera y completa el campo "Nombre".
        WebElement elementNombreRegistro = wait.until(ExpectedConditions.presenceOfElementLocated(nombreRegistro));
        elementNombreRegistro.sendKeys(nombre);

        // Comentario: Espera y completa el campo "Apellido".
        WebElement elementApellidoRegistro = wait.until(ExpectedConditions.presenceOfElementLocated(apellidoRegistro));
        elementApellidoRegistro.sendKeys(apellido);

        // Comentario: Espera y completa el campo "Correo electrónico".
        WebElement elementMailRegistro = wait.until(ExpectedConditions.presenceOfElementLocated(mailRegistro));
        elementMailRegistro.sendKeys(mail);

        // Comentario: Espera y completa el campo "Teléfono".
        WebElement elementTelefonoRegistro = wait.until(ExpectedConditions.presenceOfElementLocated(telefonoRegistro));
        elementTelefonoRegistro.sendKeys(telefono);

        // Comentario: Espera y completa el campo "Contraseña".
        WebElement elementContrasenaRegistro = wait.until(ExpectedConditions.presenceOfElementLocated(contrasenaRegistro));
        elementContrasenaRegistro.sendKeys(contrasena);

        // Comentario: Espera y completa el campo "Confirmar Contraseña".
        WebElement elementContrasena2Registro = wait.until(ExpectedConditions.presenceOfElementLocated(contrasena2Registro));
        elementContrasena2Registro.sendKeys(contrasena);

        // Comentario: Espera y marca la casilla de verificación "Acepto los términos y condiciones".
        WebElement elementCheckRegistro = wait.until(ExpectedConditions.presenceOfElementLocated(checkRegistro));
        elementCheckRegistro.click();

        // Comentario: Espera y hace clic en el botón "Registro".
        WebElement elementRegistroBtn = wait.until(ExpectedConditions.elementToBeClickable(registroBtn));
        elementRegistroBtn.click();
    }
}
