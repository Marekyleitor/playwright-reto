package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CartPage {

    private final Page page;
    private final Locator continueShoppingButton;
    private final Locator checkoutButton;
    private final Locator removeToCartButton01;
    private final Locator removeToCartButton02;
    private final Locator removeToCartButton03;
    private final Locator removeToCartButton04;
    private final Locator removeToCartButton05;
    private final Locator removeToCartButton06;

    public CartPage(Page page){
        this.page = page;
        this.continueShoppingButton = page.locator("[data-test=\"continue-shopping\"]");
        this.checkoutButton = page.locator("[data-test=\"checkout\"]");

        this.removeToCartButton01 = page.locator("#remove-sauce-labs-backpack");
        this.removeToCartButton02 = page.locator("#remove-sauce-labs-bike-light");
        this.removeToCartButton03 = page.locator("#remove-sauce-labs-bolt-t-shirt");
        this.removeToCartButton04 = page.locator("#remove-sauce-labs-fleece-jacket");
        this.removeToCartButton05 = page.locator("#remove-sauce-labs-onesie");
        this.removeToCartButton06 = page.locator("#remove-test.allthethings()-t-shirt-(red)");
    }

    public void clickToContinueShoppingButton(){
        this.continueShoppingButton.click();
    }

    public void clickToCheckoutButton(){
        this.checkoutButton.click();
    }

    public void removeToCartProduct(String itemName){
        Locator selectedItem;
        if (itemName.contains("Backpack")){
            selectedItem = this.removeToCartButton01;
        } else if (itemName.contains("Bike Light")) {
            selectedItem = this.removeToCartButton02;
        } else if (itemName.contains("Bolt T-Shirt")) {
            selectedItem = this.removeToCartButton03;
        } else if (itemName.contains("Fleece Jacket")) {
            selectedItem = this.removeToCartButton04;
        } else if (itemName.contains("Onesie")) {
            selectedItem = this.removeToCartButton05;
        } else if (itemName.contains("Test.allTheThings")) {
            selectedItem = this.removeToCartButton06;
        } else {
            System.out.println("itemName inválido, no se removerá del carrito.");
            return;
        }
        selectedItem.click();
//        this.itemName = page.locator("//div[text='" + itemName + "']");
    }

}
