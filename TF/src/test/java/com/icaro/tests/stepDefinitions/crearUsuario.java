package com.icaro.tests.stepDefinitions;

import AutomationPractice.HomePage;
import AutomationPractice.RegisterPage;
import AutomationPractice.UserPage;
import com.icaro.tests.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;


public class crearUsuario {

    private HomePage homePage;
    private RegisterPage registerPage;
    private UserPage userPage;

public crearUsuario(){
    this.homePage = new HomePage(Hooks.getDriver());
    this.registerPage = new RegisterPage(Hooks.getDriver());
    this.userPage = new UserPage(Hooks.getDriver());
}
    @Dado("el usuario se encuentra en la pagina")

    public void elUsuarioseEncuentraEnLaPagina(){
    homePage.abrirPagina("https://opencart.abstracta.us/");


    }

    @Cuando("el usuario clickea my account")
    public void elUsuarioClickeaMyAccount() {
        homePage.accederAlBotonMyAccount();
        homePage.accederAlRegistro();
    }

    @Y("se registra en la pagina")
    public void seRegistraEnLaPagina() {
        registerPage.Registracion("santiago", "boggetti","santi@prueba.com","2617818787","123456");
    }

    @Entonces("se valida el registro")
    public void seValidaElRegistro() {
    userPage.validacionUsuarioEsVisible();
    }

}
