# Proyecto de Automatización con Playwright y Cucumber

## Descripción
Este proyecto es parte del **Reto de Automatización QA – FrontEnd**. Consiste en la creación de una suite de pruebas automatizadas sobre la aplicación web [Sauce Demo](https://www.saucedemo.com/), utilizando **Java + Maven**, **Playwright** y **Cucumber** con implementación del patrón de diseño **Page Object Model (POM)**.

Los escenarios cubren el flujo completo de compra, validaciones de login y manejo de diferentes tipos de usuarios.

---

## Requisitos previos

- **Java 17** o superior
- **Maven 3.9+**
- Conexión a internet para descargar dependencias
- (Opcional) IDE como IntelliJ IDEA o Eclipse

---

## Instalación y configuración

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Marekyleitor/playwright-reto.git
   cd playwright-reto
   ```

2. Instalar dependencias con Maven:
   ```bash
   mvn clean install
   ```

3. (Opcional) Verificar dependencias:
   ```bash
   mvn dependency:tree
   ```

---

## Ejecución de pruebas

### Desde consola

Para ejecutar todos los escenarios de prueba:
```bash
mvn test
```

Si deseas ejecutar una **feature específica**:
```bash
mvn test -Dcucumber.options="src/test/resources/features/Realizar_compra_exitosa.feature"
```

### Desde el archivo RunnerTest.java
Ubicado en la ruta "src/test/java/runner/" y que es más comodo de usar al cambiar solo el tag necesario:

```java
@CucumberOptions(  
  features = "src/test/resources/features",   // Ruta a tus .feature  
  glue = "steps",                             // Paquete de tus Step Definitions y Hooks  
  tags = "@Realizar_compra_exitosa",   // 👈 aquí el tag del escenario o caso de prueba
  plugin = {  
          "html:target/cucumber-report.html", // Reporte HTML
          "json:target/cucumber-report.json"  // Reporte JSON  
  }  
)
```

---

## Estructura del proyecto

```
playwright-reto/
│── pom.xml                  # Configuración de dependencias y build
│
├── src/test/java/
│   ├── page/                # Clases del Page Object Model
│   ├── steps/               # Step Definitions de Cucumber
│   ├── runner/              # Runner de pruebas
│
├── src/test/resources/
│   └── features/            # Archivos .feature en Gherkin
│
└── target/                  # Archivos generados por Maven
```

---

## Escenarios cubiertos

- **Login**:
  - Usuario válido puede iniciar sesión (`standard_user / secret_sauce`)
  - Usuario inválido no puede iniciar sesión
  - Usuario bloqueado no puede iniciar sesión (`locked_out_user / secret_sauce`)

- **Carrito**:
  - Agregar productos al carrito
  - Visualizar productos en el carrito

- **Realizar Compra**:
  - Completar flujo de compra hasta la confirmación

-  **Extra**: Se tienen mapeados otros escenarios intermedios que no se pidieron en el reto como:
    - Retirar productos desde el carrito
    - Concluir una compra con el carrito vacío
    - Validación de intento de logeo y los campos "First name", "Last name" y "Zip/Postal code"
    - Comprobación de funcionamiento de los botones "Continue to Shopping" y "Cancel" que sirven para retornar a una página anterior.
    - Y más.

---

## Patrones de diseño aplicados
- **Page Object Model (POM):** separación de lógica de UI en clases representando páginas de la aplicación.
- **Hooks de Cucumber:** configuración global de inicio y cierre de navegador.

---

## Autores

- Marek Joel Rivas Zavala  

Proyecto desarrollado como parte del **Reto de Automatización QA – FrontEnd**.