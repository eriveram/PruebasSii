package com.pruebas.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.pruebas.ui.JavaScriptUI.BUTTON_ALERTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class JavaScriptAlTasks implements Task {


    @Step("{0} se acepta la alerta")
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BUTTON_ALERTA, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BUTTON_ALERTA),
                    Switch.toAlert().andAccept()
            );
    }

    public static Performable JavaScriptAlertasTask() {
        return instrumented(JavaScriptAlTasks.class);
    }

}