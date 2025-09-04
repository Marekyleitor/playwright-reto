package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class InventoryPage {
    private final Page page;

    public InventoryPage(Page page) {
        this.page = page;
    }

    public void addToCartProduct(String itemName) {
        page.locator("//div[text()='" + itemName + "']/ancestor::div[@class='inventory_item']//button").click();
    }

    public void goToTheCart() {
        page.locator(".shopping_cart_link").click();
    }
}