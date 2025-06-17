@UserCompra @web
Feature: El usuario realiza el proceso de compra de productos


  Scenario Outline: Login de usuario para creacion de cliente exitosamente
    Given que el cliente admin ingresa a la pagina de login con los datos "<usuario>" "<contrasenia>"
    When se dirige al modulo de crear clientes
    Then el usuario realiza el registro de clientes ingresando los datos "<name>", "<lastname>", "<cedula>","<ciudad>"

    Examples:
      | usuario      | contrasenia     | name    | lastname | cedula | ciudad |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* | Enrique | Rivera   | 0703540534  | Quito  |