package com.pruebas.glue;

import com.pruebas.actions.Time;
import com.pruebas.questions.UploadingFilesQues;
import com.pruebas.questions.UploadingResultadoQues;
import com.pruebas.tasks.UploadingFilesTask;
import com.pruebas.ui.UploadingFilesUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class UploadingFilesGlue {


    @Given("El {actor} ingresa a la pagina de prueba")
    public void elClienteIngresaALaPaginaDePrueba(Actor actor) {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(UploadingFilesUI.class)
        );
    }

    @And("observa el home {}")
    public void observaElHome(String inicio) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(UploadingFilesQues.ValidaInicio(inicio),is(true)));
    }

    @When("el cliente carga el archivo de la {string}")
    public void elClienteCargaElArchivoDeLa(String archivo) {
        when(theActorInTheSpotlight()).attemptsTo(
                UploadingFilesTask.UploadingFile(archivo)
        );
    }

    @Then("visualiza la {string}")
    public void visualizaLa(String respuesta) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(UploadingResultadoQues.ValidaResultado(respuesta),is(true)));
        Time.getTimeTwo();
    }
}
