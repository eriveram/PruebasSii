package com.pruebas.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("page:webdriver.base.url.UploadFile")
public class UploadingFilesUI extends PageObject{

    public static final Target LABEL_HOME = Target.the("File Uploader").locatedBy("//h3[normalize-space()='File Uploader']");
    public static final Target BUTTON_SELECCIONAR_ARCHIVO = Target.the("Seleccionar Archivo").locatedBy("//input[@id='file-upload']");
    public static final Target BUTTON_UPLOAD = Target.the("Boton Upload").locatedBy("//input[@id='file-submit']");
    public static final Target LABEL_RESULTADO = Target.the("Valida el Resultado").located(By.id("uploaded-files"));

}