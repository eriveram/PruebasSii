package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.ui.CrearClienteSiigo.INGRESA_CLIENTE;
import static com.pruebas.ui.SiigoLogin.*;
import static com.pruebas.ui.SiigoLogin.BUTTON_CREAR;

public class CrearClienteSiigo implements Task {

    public static CrearClienteSiigo crearClienteSiigo() {
        return Tasks.instrumented(CrearClienteSiigo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Task.where("Click en cliente",
                        Click.on(INGRESA_CLIENTE)
                ));
    }
}
