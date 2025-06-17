@REQ_BPPE-2 @capacitacion
Feature:  Alertas con JavaScripts

  @id:1 @JavaAlerta
  Scenario Outline: T-E2E-BPPE-2-CA-1 - Prueba JavaScripts de tipo Alerta
    Given El Cliente user ingresa al portal
    When el user le da click en el boton alerta
    Then visualiza la notificacion del "<mensaje>"

    Examples:
      | @externaldata@Alerta1.csv |

  @id:2 @JavaConfirmacion
  Scenario Outline: T-E2E-BPPE-2-CA-2 - Prueba  JavaScripts de tipo Confirmacion
    Given El Cliente user ingresa al portal
    When el cliente le da click en el boton confirmacion
    Then visualiza la notificacion del "<mensaje>"

    Examples:
      | @externaldata@Alerta2.csv |
