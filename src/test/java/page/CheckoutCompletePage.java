package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class CheckoutCompletePage {

    private final Page page;
    private final Locator backToProductsButton;

    public CheckoutCompletePage(Page page){
        this.page = page;
        this.backToProductsButton = page.locator("#back-to-products");
    }

    public void clickToBackToProductsButton(){
        this.backToProductsButton.click();
    }

    public void saveScreenshotEvidence(String ssName){
        this.page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(ssName)));
    }

}
