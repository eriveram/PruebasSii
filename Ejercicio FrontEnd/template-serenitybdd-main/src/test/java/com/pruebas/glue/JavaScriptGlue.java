package com.pruebas.glue;

import com.pruebas.tasks.JavaScriptConfTasks;
import com.pruebas.ui.JavaScriptUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import static com.pruebas.tasks.JavaScriptAlTasks.JavaScriptAlertasTask;
import static com.pruebas.ui.JavaScriptUI.LABEL_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class JavaScriptGlue {

    @Given("El Cliente {actor} ingresa al portal")
    public void elClienteUserIngresaAlPortal(Actor actor) {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(JavaScriptUI.class)
        );
    }

    @When("el user le da click en el boton alerta")
    public void elUserLeDaClickEnElBotonAlerta() {
        when(theActorInTheSpotlight()).attemptsTo(
                JavaScriptAlertasTask()
        );
    }

    @Then("visualiza la notificacion del {string}")
    public void visualizaLaNotificacionDel(String mensaje) {

        then(theActorInTheSpotlight()).should(
                seeThat(the(LABEL_RESULTADO), containsText(mensaje))
        );
    }

    @When("el cliente le da click en el boton confirmacion")
    public void elClienteLeDaClickEnElBotonConfirmacion() {
        when(theActorInTheSpotlight()).attemptsTo(
                new JavaScriptConfTasks()
        );
    }

}
