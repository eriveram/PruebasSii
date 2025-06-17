## Ejecutar ##
1.- En la línea 20 del archivo src/test/java/runners/Runner registrar el tag de la prueba "Feature" que se va a ejecutar
2.- Clic derecho en el archivo Runner y ejecutar "Run 'Runner'"

## REPORTE ##
El reporte se puede obtener en la ruta **target/site/serenity/index.html**

## Instrucciones de uso ##
* En la carpeta src/test/resources/config/serenity.properties se puede configurar el navegador
* Esta desarrollado con la version JDK 21 y Gradle 8.7
* Como consideración adicional, el momento de ejecutar la pagina web de test reconoce el XPATH de Ingreso de Usuario pero al re ejecutar ya no lo reconoce,al parecer hay un problema con el XPATH de la pagina web, por lo que se recomienda modificar el XPATH.

## Conclusiones ##
* La prueba no se pudo ejecutar por completo ya que al ingresar los datos para crear el usuario, no reconocia el selector por lo que hubo problemas para el ingreso y posterior culminación del ejercicio.