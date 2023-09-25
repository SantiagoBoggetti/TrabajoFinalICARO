package com.icaro.tests.stepDefinitions;

import AutomationPractice.*;
import com.icaro.tests.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class Carrito {
    private LoginPage loginPage;
    private CamaraPage camaraPage;
    private HomePage homePage;
    private CarritoPage carritoPage;

    public Carrito(){
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.camaraPage = new CamaraPage(Hooks.getDriver());
        this. homePage = new HomePage(Hooks.getDriver());
        this. carritoPage = new CarritoPage(Hooks.getDriver());


    }

    @Cuando("elige un producto para comprar")
    public void eligeUnProductoParaComprar(){
        loginPage.clickearCamara();
        camaraPage.agregarAlCarrito();
    }

    @Entonces("se valida que el producto seleccionado esta en carrito")
    public void seValidaQueElProductoSeleccionadoEstaEnCarrito() {
        carritoPage.carritoEsVisible();
    }
}
