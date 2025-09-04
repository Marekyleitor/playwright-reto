package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CheckoutStepTwoPage {

    private final Page page;
    private final Locator cancelButton;
    private final Locator finishButton;

    public CheckoutStepTwoPage(Page page){
        this.page = page;
        this.cancelButton = page.locator("#cancel");
        this.finishButton = page.locator("#finish");
    }

    public void clickToFinishButton(){
        this.finishButton.click();
    }

    public void clickToCancelAndReturnToInventory(){
        this.cancelButton.click();
    }

}
