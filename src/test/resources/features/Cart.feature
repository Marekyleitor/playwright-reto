@Cart
Feature:
  Como un cliente de Sauce Demo,
  Quiero poder iniciar sesión
  Para poder ver que productos de la tienda me gustaría adquirir

  @Cart_remover_producto_en_carrito
  Scenario Outline: Caso 01 - Remuevo producto del carrito desde la página del Carrito
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Bolt T-Shirt"
    And añadimos al carrito el producto "Sauce Labs Fleece Jacket"
    And clicamos en el icono del carrito
    And removemos el producto "Sauce Labs Fleece Jacket" del carrito
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | screenshot_name                      |
      | standard_user | secret_sauce | Cart_remover_producto_en_carrito.png |

  @Cart_continuar_comprando
  Scenario Outline: Caso 02 - Estando en la página del Carrito decido regresar para elegir más productos
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Bolt T-Shirt"
    And añadimos al carrito el producto "Sauce Labs Fleece Jacket"
    And clicamos en el icono del carrito
    And clicamos en el botón Continue Shopping
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | screenshot_name              |
      | standard_user | secret_sauce | Cart_continuar_comprando.png |

  @Cart_completado_con_productos
  Scenario Outline: Caso 03 - Estando en la página del Carrito continuo con éxito al Checkout
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Bolt T-Shirt"
    And añadimos al carrito el producto "Sauce Labs Fleece Jacket"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | screenshot_name     |
      | standard_user | secret_sauce | Cart_completado_con_productos.png |

  @Cart_checkout_removiendo_todos_los_productos
  Scenario Outline: Caso 04 - Estando en la página del Carrito remuevo todos los productos y continuo con éxito al Checkout
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And añadimos al carrito el producto "Sauce Labs Bolt T-Shirt"
    And añadimos al carrito el producto "Sauce Labs Fleece Jacket"
    And clicamos en el icono del carrito
    And removemos el producto "Sauce Labs Bolt T-Shirt" del carrito
    And removemos el producto "Sauce Labs Fleece Jacket" del carrito
    And clicamos en el botón Checkout
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | screenshot_name     |
      | standard_user | secret_sauce | Cart_checkout_removiendo_todos_los_productos.png |

  @Cart_checkout_sin_agregar_productos
  Scenario Outline: Caso 05 - Estando en la página del Carrito sin productos y continuo con éxito al Checkout
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And clicamos en el icono del carrito
    And clicamos en el botón Checkout
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | screenshot_name     |
      | standard_user | secret_sauce | Cart_checkout_sin_agregar_productos.png |