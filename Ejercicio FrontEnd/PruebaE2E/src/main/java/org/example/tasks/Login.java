package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.example.model.ModelCredenciales;

import static org.example.ui.Login.*;

public class Login implements Task {
    private final ModelCredenciales data;

    public Login(ModelCredenciales data) {
        this.data = data;
    }
    public static Login ingresoCredenciales(ModelCredenciales data) {
        return Tasks.instrumented(Login.class, data);
    }

    @Step("{0} inicia sesión:")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               Task.where("Ingresa las credenciales e inicia sesión",
                       Enter.keyValues(data.getUsuario()).into(EMAIL),
                       Enter.keyValues(data.getContrasenia()).into(PASSWORD),
                      Click.on(LOGIN_BUTTON)

                ));
    }
}
