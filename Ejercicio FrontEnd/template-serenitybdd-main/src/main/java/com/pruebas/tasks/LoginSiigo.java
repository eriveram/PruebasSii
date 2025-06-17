package com.pruebas.tasks;

import com.pruebas.model.ModelCredenciales;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.ui.SiigoLogin.*;

public class LoginSiigo implements Task {
    private final ModelCredenciales data;

    public LoginSiigo(ModelCredenciales data) {
        this.data = data;
    }

    public static LoginSiigo ingresoCredenciales(ModelCredenciales data) {
        return Tasks.instrumented(LoginSiigo.class, data);
    }

    @Step("{0} inicia sesión:")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Task.where("Ingresa las credenciales e inicia sesión",
                        Enter.keyValues(data.getUsuario()).into(INPUT_USUARIO),
                        Enter.keyValues(data.getContrasenia()).into(INPUT_CONTRASENIA),
                        Click.on(LOGIN_BUTTON),
                        WaitUntil.the(BUTTON_CREAR, WebElementStateMatchers.isVisible()).forNoMoreThan(180).seconds(),
                        Click.on(BUTTON_CREAR)
                ));
    }
}
