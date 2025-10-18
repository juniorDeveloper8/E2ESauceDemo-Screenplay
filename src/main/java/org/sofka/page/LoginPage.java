package org.sofka.page;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USER_NAME = Target.the("NOMBRE DE USUARIO")
            .locatedBy("#user-name");

    public static final Target USER_PASSWORD = Target.the("CONTRASEÑA DE USUARIO")
            .locatedBy("#password");

    public static final Target LOGIN_BTN = Target.the("BOTÓN DE INICIO DE SESIÓN")
            .locatedBy("#login-button");

}
