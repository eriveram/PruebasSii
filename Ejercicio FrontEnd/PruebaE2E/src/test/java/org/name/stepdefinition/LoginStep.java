package org.name.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class LoginStep {
    @Given("que el cliente {actor} ingresa a la pagina de login con los datos {string} {string}")
    public void queElClienteAdminIngresaALaPaginaDeLoginConLosDatos(Actor actor, String arg1, String arg2) {
    }

    @When("se dirige al modulo de crear clientes")
    public void seDirigeAlModuloDeCrearClientes() {
    }

    @Then("el usuario realiza el registro de clientes ingresando los datos {string}, {string}, {string},{string}")
    public void elUsuarioRealizaElRegistroDeClientesIngresandoLosDatos(String arg0, String arg1, String arg2, String arg3) {
    }
}
