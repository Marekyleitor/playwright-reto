@CheckoutStepTwo
Feature:
  Como un cliente de Sauce Demo,
  Quiero poder iniciar sesión
  Para poder ver que productos de la tienda me gustaría adquirir

  @CheckoutStepTwo_Cancel
  Scenario Outline: Caso 01 - Validar que el botón Cancel me redirija al Inventario
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Onesie"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And llenar formulario con nombre "<first_name>", apellido "<last_name>", código postal "<postal_code>" y clic a continuar
    And clicamos en el botón Cancel y retornamos a la página del Inventario
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | first_name | last_name | postal_code | screenshot_name            |
      | standard_user | secret_sauce | Marek      | Rivas     | 51          | CheckoutStepTwo_Cancel.png |

  @CheckoutStepTwo_Finish
  Scenario Outline: Caso 02 - Validar que el botón Finish me dirija a la página CheckoutComplete
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Onesie"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And llenar formulario con nombre "<first_name>", apellido "<last_name>", código postal "<postal_code>" y clic a continuar
    And clicamos en el botón Finish
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | first_name | last_name | postal_code | screenshot_name            |
      | standard_user | secret_sauce | Marek      | Rivas     | 51          | CheckoutStepTwo_Finish.png |