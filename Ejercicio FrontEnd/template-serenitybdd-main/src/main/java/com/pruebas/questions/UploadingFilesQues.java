package com.pruebas.questions;

import com.pruebas.ui.UploadingFilesUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class UploadingFilesQues implements Question {

    private final String Inicio;

    public UploadingFilesQues(String inicio) {
        Inicio = inicio;
    }

    @Override
    public Object answeredBy( Actor actor) {
        actor.attemptsTo(WaitUntil.the(UploadingFilesUI.LABEL_HOME, containsText(Inicio)).forNoMoreThan(20).seconds());
        return true;
    }

    public static UploadingFilesQues ValidaInicio (String inicio) {
        return new UploadingFilesQues(inicio);
    }
}
