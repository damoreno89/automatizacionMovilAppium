package capacitacionmobile.tasks;

import capacitacionmobile.userinterfaces.RepositorioLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DigitaCredencialesAcceso implements Task {

private String arg0;
private String arg1;

    public DigitaCredencialesAcceso(String arg0, String arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }

    public static DigitaCredencialesAcceso usuario(String arg0, String arg1) {
        return Tasks.instrumented(DigitaCredencialesAcceso.class,arg0,arg1);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(arg0).into(RepositorioLogin.TXT_USER),
            Enter.theValue(arg1).into(RepositorioLogin.TXT_PASSWORD),
            Click.on(RepositorioLogin.BTN_ACEPTAR)

    );

    }
}
