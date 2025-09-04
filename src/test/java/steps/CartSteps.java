package steps;

import io.cucumber.java.en.And;
import page.CartPage;

public class CartSteps {
    private CartPage cartPage = new CartPage(Hooks.page);

    @And("clicamos en el botón Checkout")
    public void clicamos_en_el_boton_Checkout() {
//        System.out.println("➡️ Usando Hooks.page en Inventory: " + Hooks.page);
        System.out.println("➡️ And clicamos en el botón Checkout");
        cartPage.clickToCheckoutButton();
    }

    @And("clicamos en el botón Continue Shopping")
    public void clicamos_en_el_icono_del_carrito() {
        System.out.println("➡️ And clicamos en el botón Continue Shopping");
        cartPage.clickToContinueShoppingButton();
    }

    @And("removemos el producto {string} del carrito")
    public void removemos_el_producto_del_carrito(String itemName) {
//        System.out.println("➡️ Usando Hooks.page en Inventory: " + Hooks.page);
        System.out.println("➡️ And removemos el producto " + itemName + " del carrito");
        cartPage.removeToCartProduct(itemName);
    }
}