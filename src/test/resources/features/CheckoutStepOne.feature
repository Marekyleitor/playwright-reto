@CheckoutStepOne
Feature:
  Como un cliente de Sauce Demo,
  Quiero poder iniciar sesión
  Para poder ver que productos de la tienda me gustaría adquirir

  @CheckoutStepOne_validar_campo_First_Name
  Scenario Outline: Caso 01 - Validar que sea necesario el campo First Name
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Onesie"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And llenar formulario con nombre "<first_name>", apellido "<last_name>", código postal "<postal_code>" y clic a continuar
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | first_name | last_name | postal_code | screenshot_name                              |
      | standard_user | secret_sauce |            |           |             | CheckoutStepOne_validar_campo_First_Name.png |

  @CheckoutStepOne_validar_campo_Last_Name
  Scenario Outline: Caso 02 - Validar que sea necesario el campo Last Name
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Onesie"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And llenar formulario con nombre "<first_name>", apellido "<last_name>", código postal "<postal_code>" y clic a continuar
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | first_name | last_name | postal_code | screenshot_name                             |
      | standard_user | secret_sauce | Marek      |           |             | CheckoutStepOne_validar_campo_Last_Name.png |

  @CheckoutStepOne_validar_campo_Postal_Code
  Scenario Outline: Caso 03 - Validar que sea necesario el campo Postal Code
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Onesie"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And llenar formulario con nombre "<first_name>", apellido "<last_name>", código postal "<postal_code>" y clic a continuar
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | first_name | last_name | postal_code | screenshot_name                              |
      | standard_user | secret_sauce | Marek      | Rivas     |             | CheckoutStepOne_validar_campo_Postal_Code.png |