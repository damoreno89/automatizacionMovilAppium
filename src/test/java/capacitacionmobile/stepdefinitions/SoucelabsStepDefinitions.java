package capacitacionmobile.stepdefinitions;

import capacitacionmobile.questions.VerificarSesion;
import capacitacionmobile.tasks.DigitaCredencialesAcceso;
import capacitacionmobile.tasks.IngresoSaucelabs;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


public class SoucelabsStepDefinitions {
    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Indra ingresa a la apk saucelabs")
    public void indraIngresaALaApkSaucelabs() {
        OnStage.theActor("indra").wasAbleTo(IngresoSaucelabs.abrirApp());
    }

    @When("digita las credenciales de acceso {string} y {string}")
    public void digitaLasCredencialesDeAccesoY(String arg0, String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(DigitaCredencialesAcceso.usuario(arg0,arg1));
    }

    @Then("verifica que ingreso correctamente")
    public void verificaQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarSesion.sauceLabs(), Matchers.equalTo("PRODUCTS")));
    }
}
