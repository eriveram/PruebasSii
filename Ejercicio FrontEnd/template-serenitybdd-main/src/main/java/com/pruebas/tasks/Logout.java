package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.annotations.Step;

import java.time.Duration;

import static com.pruebas.ui.UserInterfaceCarrito.BUTTON_LOGOUT;
import static com.pruebas.ui.UserInterfaceCarrito.BUTTON_MENU;
import static com.pruebas.ui.UserInterfaceLogin.*;

public class Logout implements Task {

    public static Logout logout(){
        return Tasks.instrumented(Logout.class);
    }
    @Step("{0} se desloggea")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Task.where("Se desloggea",
                        Click.on(BUTTON_MENU),
                        Click.on(BUTTON_LOGOUT),
                        Ensure.that(LOGIN_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(4))).isDisplayed()
                ));
    }
}