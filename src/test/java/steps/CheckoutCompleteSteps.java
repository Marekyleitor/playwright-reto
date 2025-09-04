package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.CheckoutCompletePage;

import static steps.Hooks.takeScreenshot;

public class CheckoutCompleteSteps {
    private CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(Hooks.page);

    @Then("clicamos en el botón Back Home")
    public void clicamos_en_el_boton_Back_Home() {
        System.out.println("➡️ And clicamos en el botón Back Home");
        checkoutCompletePage.clickToBackToProductsButton();
    }

    @And("guardamos screenshot de evidencia con el nombre {string}")
    public void guardamos_screenshot_de_evidencia_con_el_nombre(String ssName) {
        System.out.println("➡️ And guardamos screenshot de evidencia con el nombre " + ssName);
        checkoutCompletePage.saveScreenshotEvidence(ssName);
        takeScreenshot(ssName);
    }
}