package capacitacionmobile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.logging.Logger;

public class IngresoSaucelabs implements Task {
    public static IngresoSaucelabs abrirApp(){
        return Tasks.instrumented(IngresoSaucelabs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre aplicativo saucelabs");
        actor.attemptsTo();
    }
}
