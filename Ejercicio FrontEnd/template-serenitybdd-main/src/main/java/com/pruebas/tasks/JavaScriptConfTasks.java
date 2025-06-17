package com.pruebas.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.ui.JavaScriptUI.BUTTON_ALERTA;
import static com.pruebas.ui.JavaScriptUI.BUTTON_CONFIRMACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class JavaScriptConfTasks implements Task {


    @Step("{0} se da una respuesta a la alerta")
    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                Click.on(BUTTON_CONFIRMACION),
                Switch.toAlert().andDismiss()
            );

    }

    public static Performable JavaScriptConfTasks() {
        return instrumented(JavaScriptConfTasks.class);
    }

}