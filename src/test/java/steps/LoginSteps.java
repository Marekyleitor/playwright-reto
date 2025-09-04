package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage(Hooks.page);

    @Given("ingresamos a la web de sauce demo")
    public void ingresamos_a_la_web_de_sauce_demo() {
        System.out.println("➡️ Usando Hooks.page en Login: " + Hooks.page);
        loginPage.navigate();
    }

    @When("intentamos logearnos con usuario {string} y contraseña {string}")
    public void intentamos_logearnos_con_usuario_y_contraseña(String username, String password) {
        loginPage.doLogin(username, password);
    }
}