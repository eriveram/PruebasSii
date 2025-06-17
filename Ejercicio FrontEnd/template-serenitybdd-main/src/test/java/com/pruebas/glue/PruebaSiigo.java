package com.pruebas.glue;

import com.pruebas.model.ModelCredenciales;
import com.pruebas.model.ModelDatosSiigo;
import com.pruebas.tasks.*;
import com.pruebas.ui.SiigoLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PruebaSiigo {
    @Given("que el cliente {actor} ingresa las credenciales en la pagina {string} {string}")
    public void queElClienteAdminIngresaLasCredencialesEnLaPagina(Actor actor, String usuario, String contrasenia) {
        ModelCredenciales modelCredenciales = new ModelCredenciales(usuario, contrasenia);
        givenThat(actor).attemptsTo(
                Open.browserOn().the(SiigoLogin.class),
                LoginSiigo.ingresoCredenciales(modelCredenciales)
        );
    }

    @When("se dirige al modulo de crear clientes")
    public void seDirigeAlModuloDeCrearClientes() {
        when(theActorInTheSpotlight()).attemptsTo(
                CrearClienteSiigo.crearClienteSiigo()
        );
    }

    @Then("el usuario realiza el registro de clientes ingresando los datos {string}, {string}, {string},{string}")
    public void elUsuarioRealizaElRegistroDeClientesIngresandoLosDatos(String name, String lastname, String cedula, String ciudad) {
        ModelDatosSiigo ModelDatosSiigo = new ModelDatosSiigo(name, lastname, cedula, ciudad);
        when(theActorInTheSpotlight()).attemptsTo(
               LlenaDatosSiigo.Datos(ModelDatosSiigo)
        );
    }

    @And("valida la creacion del cliente exitosamente")
    public void validaLaCreacionDelClienteExitosamente() {
    }
}
