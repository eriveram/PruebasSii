package org.name.stepdefinition;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenWebStep {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
