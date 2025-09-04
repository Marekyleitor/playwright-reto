package steps;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    public static Playwright playwright;
    public static Browser browser;
    public static Page page;
    private static Scenario scenario;

    @Before
    public void setUp(Scenario sc) {  // 👈 recibe el Scenario de Cucumber
        scenario = sc;               // 👈 lo guardamos en la variable
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        System.out.println("✅ Hooks.page creado: " + page);
    }

    public static void takeScreenshot(String name) {
        if (scenario != null) {  // seguridad por si acaso
            byte[] evidencia = page.screenshot(new Page.ScreenshotOptions().setFullPage(true));
            scenario.attach(evidencia, "image/png", name);
        } else {
            System.out.println("⚠️ Scenario es null, no se puede adjuntar screenshot");
        }
    }

    @After
    public void tearDown() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}