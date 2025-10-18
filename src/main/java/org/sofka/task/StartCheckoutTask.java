package org.sofka.task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sofka.page.DashboardPage;

import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StartCheckoutTask implements Task {
    public static StartCheckoutTask begin() {
        return new StartCheckoutTask();
    }

    @Override
    @Step("{0} inicia el proceso de checkout")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                the(DashboardPage.CHECKOUT_BTN, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DashboardPage.CHECKOUT_BTN)
        );
    }
}
