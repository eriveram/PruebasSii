package com.pruebas.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class IngresoDatosSiigo extends PageObject {
    public static final Target INGRESA_CEDULA = Target.the("Ingreso de Identificacion").located(ByShadow.cssSelector(".mdc-text-field__input.input-identification","siigo-identification-input-web[class='hydrated']"));

    public static final Target INGRESA_NOMBRE = Target.the("Ingreso de Nombre").located(ByShadow.cssSelector("#s4c83eee-1492-4c47-b934-f79195dc92eb","body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > thirdparty-root:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-third-party-detail:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > app-third-party-basic-data:nth-child(1) > siigo-card-web:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > siigo-textfield-web:nth-child(1)"));

    public static final Target INGRESA_APELLIDO = Target.the("Ingreso de Apellido").located(ByShadow.cssSelector("#s4ff727d-3252-40bd-abe8-5d4f6a62c614","body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > thirdparty-root:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-third-party-detail:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > app-third-party-basic-data:nth-child(1) > siigo-card-web:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > siigo-textfield-web:nth-child(1)"));

    public static final Target INGRESA_CIUDAD = Target.the("Ingreso de Ciudad").located(ByShadow.cssSelector("#labelAutocompleteSelectItemcity","siigo-autocomplete-web[class='hydrated'][key-id='city']"));

    public static final Target SELECCIONA_CIUDAD = Target.the("Seleccion de Ciudad").located(ByShadow.cssSelector("#divTDAutocompletecity3","siigo-autocomplete-web[class='hydrated'][key-id='city']"));

    public static final Target GUARDAR = Target.the("Boton de Guardar").locatedBy("//button[normalize-space()='Guardar']");


}
