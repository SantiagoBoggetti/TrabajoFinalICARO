package com.icaro.tests.stepDefinitions;

import AutomationPractice.HomePage;
import AutomationPractice.LoginPage;
import AutomationPractice.MyAccountPage;
import AutomationPractice.RegisterPage;
import com.icaro.tests.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class Login {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private HomePage homePage;
public Login(){
    this.loginPage = new LoginPage(Hooks.getDriver());
    this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    this.homePage = new HomePage(Hooks.getDriver());
}
@Cuando("agrega las credenciales validadas")
    public void agregaLasCredencialesvalidadas(){
    loginPage.login("santiago@hotmail.com","123456");
    }

    @Entonces("se valida el login")
    public void seValidaElLogin() {
    myAccountPage.validarLogIn();
    }

    @Y("se dirige a la seccion de login")
    public void seDirigeALaSeccionDeLogin() {
    homePage.accederAlBotonMyAccount();
    homePage.accederAlogin();

    }
}
