package com.pruebas.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("page:webdriver.base.url.siigo")
public class SiigoLogin extends PageObject {
    public static final Target INPUT_USUARIO = Target.the("Input de ingreso usuario").locatedBy("//input[@id='siigoSignInName']");
    public static final Target INPUT_CONTRASENIA = Target.the("Input de ingreso CONTRASENIA").locatedBy("//input[@id='siigoPassword']");
    public static final Target LOGIN_BUTTON = Target.the("Input de ingreso usuario").locatedBy("//button[@id='siigoNext']");
    public static final Target BUTTON_CREAR = Target.the("Label del nombre del usuario").located(ByShadow.cssSelector(".btn-element.size-m",".data-siigo-five9.hydrated","siigo-button-atom[type='button'][class='hydrated'][data-id='header-create-button']"));

    }
