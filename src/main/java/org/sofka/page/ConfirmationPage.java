package org.sofka.page;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationPage {

    public static final Target CONFIRMATION_HEADER = Target.the("mensaje de confirmación")
            .locatedBy("[data-test='complete-header']");


    public static final Target BACK_HOME_BTN = Target.the("BOTÓN PARA REGRESAR AL HOME")
            .locatedBy("#back-to-products");
}
