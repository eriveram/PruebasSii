@Siigo @cucumber
Feature: Iniciar sesion en la pagina de siigo

  @id:1 @login @PruebaSiigo
  Scenario Outline: Iniciar sesión con credenciales correctas
    Given que el cliente admin ingresa las credenciales en la pagina "<usuario>" "<contrasenia>"
    When se dirige al modulo de crear clientes
    Then el usuario realiza el registro de clientes ingresando los datos "<cedula>", "<name>", "<lastname>","<ciudad>"
    And  valida la creacion del cliente exitosamente
    Examples:
      | usuario      | contrasenia     | cedula | name | lastname | ciudad |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* | 1708078942 | Juan  | Perez  | Quito  |

