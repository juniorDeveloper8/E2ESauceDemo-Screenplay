package org.sofka.page;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target FIRSTNAME = Target.the("PRIMER NOMBRE")
            .locatedBy("#first-name");

    public static final Target LASTNAME = Target.the("APELLIDO")
            .locatedBy("#last-name");

    public static final Target POSTALCODE = Target.the("CÓDIGO POSTAL")
            .locatedBy("#postal-code");

    public static final Target NEXT_BTN = Target.the("BOTÓN DE CONTINUAR")
            .locatedBy("#continue");

    public static final Target FINISH_PURCHASE_BTN = Target.the("BOTÓN DE FINALIZACIÓN DE COMPRA")
            .locatedBy("#finish");
}
