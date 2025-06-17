package com.pruebas.tasks;

import com.pruebas.ui.UploadingFilesUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import java.io.File;
import static com.pruebas.ui.UploadingFilesUI.BUTTON_SELECCIONAR_ARCHIVO;

public class UploadingFilesTask implements Task {

    private final String ruta;

    public UploadingFilesTask(String ruta){
        this.ruta = ruta;
    }

    public static UploadingFilesTask UploadingFile(String ruta){
        return Tasks.instrumented(UploadingFilesTask.class, ruta);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File file = new File(ruta);
        actor.attemptsTo(
                Upload.theFile(file.toPath()).to(BUTTON_SELECCIONAR_ARCHIVO),
                Click.on(UploadingFilesUI.BUTTON_UPLOAD)
        );
    }
}
