package steps;

import io.cucumber.java.en.And;
import page.CheckoutStepOnePage;

public class CheckoutStepOneSteps {
    private CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(Hooks.page);

    @And("llenar formulario con nombre {string}, apellido {string}, código postal {string} y clic a continuar")
    public void llenar_formulario_con_nombre_apillido_y_codigo_postal(String firstName, String lastName, String postalCode) {
        System.out.println("➡️ And llenar formulario con nombre "+firstName+", apellido "+lastName+" y código postal "+postalCode);
        checkoutStepOnePage.fillFormWithFirstLastNameAndPostalCode(firstName, lastName, postalCode);
    }

    @And("clicamos en el botón Cancel y volvemos a la página del Carrito")
    public void clicamos_en_el_boton_Cancel_y_volvemos_a_la_pagina_del_carrito() {
        System.out.println("➡️ And clicamos en el botón Cancel y volvemos a la página del carrito");
        checkoutStepOnePage.cancelAndReturnToCartPage();
    }
}