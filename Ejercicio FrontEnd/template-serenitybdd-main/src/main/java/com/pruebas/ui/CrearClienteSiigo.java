package com.pruebas.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class CrearClienteSiigo extends PageObject {
    public static final Target INGRESA_CLIENTE= Target.the("Label del nombre del usuario").located(ByShadow.cssSelector(" div:nth-child(1) > header:nth-child(3) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > siigo-header-create-button-dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > li:nth-child(4) > div:nth-child(1) > a:nth-child(1)",".data-siigo-five9.hydrated"));
}
