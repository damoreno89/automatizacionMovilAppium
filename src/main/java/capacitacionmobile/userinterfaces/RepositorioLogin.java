package capacitacionmobile.userinterfaces;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class RepositorioLogin {

    public static final Target TXT_USER = Target.the("campo usuario").located(AppiumBy.accessibilityId("test-Username"));
    public static final Target TXT_PASSWORD = Target.the("campo contraseña").located(AppiumBy.accessibilityId("test-Password"));
    public static final Target BTN_ACEPTAR = Target.the("click en boton aceptar").located(AppiumBy.accessibilityId("test-LOGIN"));
    public static final Target LBL_VERIFICA_INGRESO = Target.the("Verifica Ingreso a saucelabs").located(AppiumBy.xpath("//android.widget.TextView[@text=\"PRODUCTS\"]"));
}
