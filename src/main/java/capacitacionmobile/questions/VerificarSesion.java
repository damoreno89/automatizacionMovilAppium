package capacitacionmobile.questions;


import capacitacionmobile.userinterfaces.RepositorioLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarSesion implements Question<String> {

    public static VerificarSesion sauceLabs() {
           return new VerificarSesion();
    }

    @Override
    public String answeredBy(Actor actor) {
           return Text.of(RepositorioLogin.LBL_VERIFICA_INGRESO).answeredBy(actor).toString();
    }
}




