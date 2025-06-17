package org.name.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/Prueba.feature",
    glue = "org.name.stepdefinition",
    tags = "@web",
    plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"}
)
public class runnerWeb {
}
