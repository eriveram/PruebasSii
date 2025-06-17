package org.example.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")
public class Login extends PageObject {
    public static final Target EMAIL = Target.the("email").locatedBy("//*[@id=\"siigoSignInName\"]");
    public static final Target PASSWORD = Target.the("password").locatedBy("//*[@id=\"siigoPassword\"]");
    public static final Target LOGIN_BUTTON = Target.the("login button").locatedBy("//*[@id=\"siigoNext\"]");
}
