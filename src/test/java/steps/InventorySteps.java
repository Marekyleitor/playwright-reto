package steps;

import io.cucumber.java.en.And;
import page.InventoryPage;

public class InventorySteps {
    private InventoryPage inventoryPage = new InventoryPage(Hooks.page);

    @And("añadimos al carrito el producto {string}")
    public void añadimos_al_carrito_el_producto(String itemName) {
//        System.out.println("➡️ Usando Hooks.page en Inventory: " + Hooks.page);
        System.out.println("➡️ And añadimos al carrito el producto " + itemName);
        inventoryPage.addToCartProduct(itemName);
    }

    @And("clicamos en el icono del carrito")
    public void clicamos_en_el_icono_del_carrito() {
        System.out.println("➡️ And clicamos en el icono del carrito");
        inventoryPage.goToTheCart();
    }
}