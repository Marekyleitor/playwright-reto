@Login
Feature:
  Como un cliente de Sauce Demo,
  Quiero poder iniciar sesión
  Para poder ver que productos de la tienda me gustaría adquirir

  @Login_exitoso
  Scenario Outline: Caso 01 - Intento de logeo exitoso con usuario <username>
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password     | screenshot_name                   |
      | standard_user | secret_sauce | Login_exitoso_(standard_user).png |
#      | problem_user            | secret_sauce | Login_exitoso_(problem_user).png            |
#      | performance_glitch_user | secret_sauce | Login_exitoso_(performance_glitch_user).png |
#      | error_user              | secret_sauce | Login_exitoso_(error_user).png              |
#      | visual_user             | secret_sauce | Login_exitoso_(visual_user).png             |

  @Login_usuario_bloqueado_contraseña_correcta
  Scenario Outline: Caso 02 - Intento de logeo con usuario bloqueado <username>
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username        | password     | screenshot_name                                 |
      | locked_out_user | secret_sauce | Login_usuario_bloqueado_contraseña_correcta.png |

  @Login_usuario_operativo_contraseña_incorrecta
  Scenario Outline: Caso 03 - Intento de logeo con usuario <username> operativo y contraseña incorrecta
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username      | password | screenshot_name                                                   |
      | standard_user | pass1    | Login_usuario_operativo_contraseña_incorrecta_(standard_user).png |
#      | problem_user            | secret_sauce | Login_usuario_operativo_contraseña_incorrecta_(problem_user).png            |
#      | performance_glitch_user | secret_sauce | Login_usuario_operativo_contraseña_incorrecta_(performance_glitch_user).png |
#      | error_user              | secret_sauce | Login_usuario_operativo_contraseña_incorrecta_(error_user).png              |
#      | visual_user             | secret_sauce | Login_usuario_operativo_contraseña_incorrecta_(visual_user).png             |

  @Login_usuario_bloqueado_contraseña_incorrecta
  Scenario Outline: Caso 04 - Intento de logeo con usuario bloqueado <username> y contraseña incorrecta
    Given ingresamos a la web de sauce demo
    When intentamos logearnos con usuario "<username>" y contraseña "<password>"
    And guardamos screenshot de evidencia con el nombre "<screenshot_name>"
    Examples:
      | username        | password | screenshot_name                                   |
      | locked_out_user | pass1    | Login_usuario_bloqueado_contraseña_incorrecta.png |