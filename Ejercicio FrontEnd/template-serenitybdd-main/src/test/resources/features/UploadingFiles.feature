@REQ_BPPE-3 @capacitacion
Feature: Prueba de carga de archivo

  @id:1 @UploadingFiles
  Scenario Outline: T-E2E-BPRE-3-CA-1 - Cargar archivo en la pagina de prueba
    Given El Cliente ingresa a la pagina de prueba
    And  observa el home <Inicio>
    When el cliente carga el archivo de la "<Ruta>"
    Then visualiza la "<Respuesta>"

    Examples:
      | @externaldata@UploadingFiles.csv |
