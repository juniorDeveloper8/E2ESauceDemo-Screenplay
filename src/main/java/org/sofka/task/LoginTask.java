package org.sofka.task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.sofka.page.LoginPage;

import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {
    private final String username;
    private final String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginTask withCredentials(String username, String password) {
        return new LoginTask(username, password);
    }

    @Override
    @Step("{0} inicia sesión con usuario y contraseña")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USER_NAME),
                Enter.theValue(password).into(LoginPage.USER_PASSWORD),
                the(LoginPage.LOGIN_BTN, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LoginPage.LOGIN_BTN)
        );
    }
}
