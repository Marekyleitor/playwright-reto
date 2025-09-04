package steps;

import io.cucumber.java.en.And;
import page.CheckoutStepTwoPage;

public class CheckoutStepTwoSteps {
    private CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(Hooks.page);

    @And("clicamos en el botón Finish")
    public void clicamos_en_el_boton_Finish() {
        System.out.println("➡️ And clicamos en el botón Finish");
        checkoutStepTwoPage.clickToFinishButton();
    }

    @And("clicamos en el botón Cancel y retornamos a la página del Inventario")
    public void clicamos_en_el_botón_Cancel_y_retornamos_a_la_pagina_del_Inventario() {
        System.out.println("➡️ And clicamos en el botón Cancel y retornamos a la página del Inventario");
        checkoutStepTwoPage.clickToCancelAndReturnToInventory();
    }
}