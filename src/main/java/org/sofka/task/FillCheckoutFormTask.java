package org.sofka.task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.sofka.page.FormPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillCheckoutFormTask implements Task {
    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public FillCheckoutFormTask(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static FillCheckoutFormTask withData(String firstName, String lastName, String postalCode) {
        return new FillCheckoutFormTask(firstName, lastName, postalCode);
    }

    @Override
    @Step("{0} completa el formulario de checkout")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(FormPage.FIRSTNAME),
                Enter.theValue(lastName).into(FormPage.LASTNAME),
                Enter.theValue(postalCode).into(FormPage.POSTALCODE),
                WaitUntil.the(FormPage.NEXT_BTN, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(FormPage.NEXT_BTN)
        );
    }
}
