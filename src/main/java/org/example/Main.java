package org.example;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        try (Playwright playwright = Playwright.create()) {
            // ===== Crear el browser y configuraciones =====
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false) // Set to true for headless mode
                    .setArgs(java.util.Arrays.asList("--start-maximized")));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(null)); // Disable default viewport
            // ===== Crear page y navegar a la página principal =====
            Page page = context.newPage();
            page.navigate("https://www.saucedemo.com/");

            //LoginPage.java
            page.locator("[data-test=\"username\"]").click();
            page.locator("[data-test=\"username\"]").fill("standard_user");
            page.locator("[data-test=\"password\"]").click();
            page.locator("[data-test=\"password\"]").fill("secret_sauce");
            page.locator("[data-test=\"login-button\"]").click();
            //InventoryPage.java
            page.locator("[data-test=\"add-to-cart-sauce-labs-backpack\"]").click();
            page.locator("[data-test=\"add-to-cart-sauce-labs-bike-light\"]").click();
            page.locator("[data-test=\"shopping-cart-link\"]").click();
//            //CartPage.java
//            page.locator("[data-test=\"checkout\"]").click();
//            //CheckoutStepOnePage.java
//            page.locator("[data-test=\"firstName\"]").fill("Marek");
//            page.locator("[data-test=\"lastName\"]").fill("Rivas");
//            page.locator("[data-test=\"postalCode\"]").fill("51");
//            page.locator("[data-test=\"continue\"]").click();
//            //CheckoutStepTwoPage.java
//            page.locator("[data-test=\"finish\"]").click();
//            //CheckoutComplete.java
//            page.locator("[data-test=\"back-to-products\"]").click();

            page.pause();
        }
    }
}