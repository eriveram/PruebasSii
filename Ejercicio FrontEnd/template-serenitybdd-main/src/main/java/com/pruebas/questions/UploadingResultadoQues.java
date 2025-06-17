package com.pruebas.questions;

import com.pruebas.ui.UploadingFilesUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class UploadingResultadoQues implements Question {

    private final String Resultado;

    public UploadingResultadoQues(String resultado) {
        Resultado = resultado;
    }

    @Override
    public Object answeredBy( Actor actor) {
        actor.attemptsTo(WaitUntil.the(UploadingFilesUI.LABEL_RESULTADO, containsText(Resultado)).forNoMoreThan(20).seconds());
        return true;
    }

    public static UploadingResultadoQues ValidaResultado (String resultado) {
        return new UploadingResultadoQues(resultado);
    }
}
