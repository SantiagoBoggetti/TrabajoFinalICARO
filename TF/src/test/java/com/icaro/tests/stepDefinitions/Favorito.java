package com.icaro.tests.stepDefinitions;

import AutomationPractice.*;
import com.icaro.tests.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class Favorito {

    private LoginPage loginPage;
    private CamaraPage camaraPage;
    private FavoritoPage favoritoPage;
    private HomePage homePage;

    public Favorito(){
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.camaraPage = new CamaraPage(Hooks.getDriver());
        this.favoritoPage = new FavoritoPage(Hooks.getDriver());
     this.homePage = new HomePage(Hooks.getDriver());

    }

    @Dado("el usuario se encuentra en la pagina ya logeado")
    public void elUsuarioSeEncuentraEnLaPaginaYaLogeado(){
        homePage.abrirPagina("https://opencart.abstracta.us/");
        homePage.accederAlBotonMyAccount();
        homePage.accederAlogin();
        loginPage.login("santiago@hotmail.com","123456");
    }


    @Cuando("elige un producto favorito")
    public void eligeUnProductoFavorito() {
        loginPage.clickearCamara();
        camaraPage.clickarCorazon();
        camaraPage.clickarWishList();
    }

    @Entonces("se valida que el producto seleccionado esta en favoritos")
    public void seValidaQueElProductoSeleccionadoEstaEnFavoritos() {
        favoritoPage.ValidacionDeFavorito();
    }
}
