package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CheckoutStepOnePage {

    private final Page page;
    private final Locator inputFirstName;
    private final Locator inputLastName;
    private final Locator inputPostalCode;
    private final Locator cancelButton;
    private final Locator continueButton;

    public CheckoutStepOnePage(Page page){
        this.page = page;
        this.inputFirstName = page.locator("#first-name");
        this.inputLastName = page.locator("#last-name");
        this.inputPostalCode = page.locator("#postal-code");
        this.cancelButton = page.locator("#cancel");
        this.continueButton = page.locator("#continue");
    }

    public void fillFormWithFirstLastNameAndPostalCode(String firstName, String lastName, String postalCode){
        this.inputFirstName.fill(firstName);
        this.inputLastName.fill(lastName);
        this.inputPostalCode.fill(postalCode);
        this.continueButton.click();
    }

    public void cancelAndReturnToCartPage(){
        this.cancelButton.click();
    }

}
