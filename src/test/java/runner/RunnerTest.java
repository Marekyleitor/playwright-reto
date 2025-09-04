package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",   // Ruta a tus .feature
        glue = "steps",                             // Paquete de tus Step Definitions y Hooks
        tags = "@Realizar_compra_exitosa",   // 👈 aquí el tag del escenario o caso de prueba
        plugin = {
                "html:target/cucumber-report.html",     // Reporte HTML
                "json:target/cucumber-report.json"      // Reporte JSON
        }
)

public class RunnerTest {
}
