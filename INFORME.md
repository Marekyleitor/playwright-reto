# Informe de Estrategia de Automatización

## 1. Introducción
Este documento resume la estrategia de automatización aplicada al **Reto de Automatización QA – FrontEnd**, utilizando **Java, Playwright, Cucumber** y el patrón de diseño **Page Object Model (POM)**.

La aplicación bajo prueba es [Sauce Demo](https://www.saucedemo.com/), la cual simula un flujo de comercio electrónico básico.

---

## 2. Estrategia de Automatización

### 2.1 Objetivo
Automatizar los escenarios clave de la aplicación web para validar el inicio de sesión, la gestión del carrito y la finalización de una compra.

### 2.2 Alcance
Los escenarios cubren:
- Inicio de sesión con credenciales válidas e inválidas.
- Restricción de acceso para usuarios bloqueados.
- Agregar productos al carrito desde el catálogo.
- Validar productos agregados en el carrito.
- Completar flujo de checkout hasta la confirmación de la orden.

### 2.3 Enfoque
- Uso de **Cucumber** para describir escenarios en **Gherkin**, facilitando la legibilidad y alineación con criterios de aceptación.
- Implementación de **Step Definitions** en Java para mapear escenarios a acciones concretas en el navegador.
- **Playwright** como motor de automatización para manejar interacciones con el DOM.

---

## 3. Patrones de Diseño Aplicados

### 3.1 Page Object Model (POM)
Cada página de la aplicación fue representada por una clase Java que abstrae:
- **Selectores de elementos** (campos, botones, etiquetas).
- **Acciones disponibles** (login, agregar producto, continuar checkout, etc.).

Beneficios:
- Mayor mantenibilidad del código.
- Reutilización de métodos en múltiples escenarios.
- Claridad en la separación entre la lógica de prueba y la lógica de UI.

### 3.2 Hooks de Cucumber
- **@Before:** Inicializa el navegador antes de cada escenario.
- **@After:** Cierra el navegador después de cada escenario.

Esto asegura independencia entre escenarios y evita contaminación de datos.

---

## 4. Cumplimiento de los Criterios de Aceptación

1. ✅ El usuario puede iniciar sesión con credenciales válidas (standard_user).
2. ✅ El usuario no puede iniciar sesión con credenciales inválidas.
3. ✅ El usuario bloqueado no puede iniciar sesión.
4. ✅ El usuario puede agregar un producto al carrito.
5. ✅ El usuario puede ver productos en el carrito.
6. ✅ El usuario puede completar el flujo de compra.

---

## 5. Buenas Prácticas

- Separación de responsabilidades: **features**, **steps**, **pages**.
- Uso de **nombres descriptivos** en métodos y selectores.
- Configuración centralizada en **pom.xml**.
- Ejecución de pruebas mediante **Maven Surefire**.

---

## 6. Extra
Adicionalmente se implementó la característica de tomar screenshot de evidencia. Este se guarda en el archivo "target/cucumber-report.html" y también como un archivo ".png" dentro de la misma raíz del proyecto ("/playwright-reto"). En todos los examples de los archivos "Feature" hay un campo para cambiarles el nombre.

---

## 7. Conclusión
La suite desarrollada cumple con los criterios del reto, implementando una solución clara, escalable y alineada con buenas prácticas de automatización de pruebas. El uso de **Playwright + Cucumber + POM** garantiza legibilidad, mantenibilidad y fácil extensión a nuevos escenarios.