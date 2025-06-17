package com.pruebas.tasks;

import com.pruebas.model.ModelDatosSiigo;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.ui.IngresoDatosSiigo.*;

public class LlenaDatosSiigo implements Task {
    private final ModelDatosSiigo data;

    public LlenaDatosSiigo(ModelDatosSiigo data) {

        this.data = data;
    }

    public static LlenaDatosSiigo Datos(ModelDatosSiigo data) {
        return Tasks.instrumented(LlenaDatosSiigo.class, data);
    }
    @Step("{0} llena formulario:")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Task.where("Ingreso Data Cliente",
                        Enter.keyValues(data.getCedula()).into(INGRESA_CEDULA),
                        Enter.keyValues(data.getName()).into(INGRESA_NOMBRE),
                        Enter.keyValues(data.getLastname()).into(INGRESA_APELLIDO),
                        Enter.keyValues(data.getCiudad()).into(INGRESA_CIUDAD),
                        WaitUntil.the(SELECCIONA_CIUDAD, WebElementStateMatchers.isVisible()).forNoMoreThan(180).seconds(),
                        Click.on(SELECCIONA_CIUDAD),
                        Click.on(GUARDAR)

                ));
    }
}
