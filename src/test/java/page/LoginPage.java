package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;
    private final Locator inputUsername;
    private final Locator inputPassword;
    private final Locator loginButton;

    public LoginPage(Page page){
        this.page = page;
        this.inputUsername = page.locator("[data-test='username']");
        this.inputPassword = page.locator("[data-test='password']");
        this.loginButton = page.locator("[data-test='login-button']");
    }

    public void navigate(){
        page.navigate("https://www.saucedemo.com/");
    }

    public void doLogin(String username, String password) {
        inputUsername.fill(username);
        inputPassword.fill(password);
        loginButton.click();
    }



}
