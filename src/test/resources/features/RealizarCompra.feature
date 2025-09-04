Feature:
  Como un cliente de Sauce Demo,
  Quiero poder iniciar sesión, agregar productos al carrito y completar una compra
  Para poder adquirir los productos que necesito

  @Realizar_compra_exitosa
  Scenario Outline: Caso 01 - Compra exitosa de productos
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Backpack"
    And añadimos al carrito el producto "Sauce Labs Bike Light"
#    And añadimos al carrito el producto "Sauce Labs Bolt T-Shirt"
#    And añadimos al carrito el producto "Sauce Labs Fleece Jacket"
#    And añadimos al carrito el producto "Sauce Labs Onesie"
#    And añadimos al carrito el producto "Test.allTheThings() T-Shirt (Red)"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And llenar formulario con nombre "<first_name>", apellido "<last_name>", código postal "<postal_code>" y clic a continuar
    And clicamos en el botón Finish
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Then clicamos en el botón Back Home
    Examples:
      | username      | password     | first_name | last_name | postal_code | screenshot_name             |
      | standard_user | secret_sauce | Marek      | Rivas     | 51          | Realizar_compra_exitosa.png |