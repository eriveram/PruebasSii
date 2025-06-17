package com.pruebas.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("page:webdriver.base.url.AlertasJavaScript")
public class JavaScriptUI extends PageObject {

    public static final Target BUTTON_ALERTA = Target.the("File Uploader").locatedBy("//button[normalize-space()='Click for JS Alert']");
    public static final Target BUTTON_CONFIRMACION = Target.the("Seleccionar Archivo").locatedBy("//button[normalize-space()='Click for JS Confirm']");
    public static final Target BUTTON_PROMPT = Target.the("Boton Upload").locatedBy("//button[normalize-space()='Click for JS Prompt']");
    public static final Target LABEL_RESULTADO = Target.the("Valida el Resultado").locatedBy("//p[@id='result']");
}