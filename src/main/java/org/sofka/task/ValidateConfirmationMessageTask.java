package org.sofka.task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;
import org.sofka.page.ConfirmationPage;
import org.sofka.question.ConfirmationMessage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidateConfirmationMessageTask implements Task {

    public static ValidateConfirmationMessageTask isVisible() {
        return new ValidateConfirmationMessageTask();
    }

    @Override
    @Step("{0} valida el mensaje final de compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ConfirmationPage.CONFIRMATION_HEADER, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()

        );

//        actor.should(
//                seeThat("el texto de confirmación",
//                        Text.of(ConfirmationPage.CONFIRMATION_HEADER),
//                        equalTo("Thank you for your order!")
//                )
//        );

        actor.attemptsTo(
                Click.on(ConfirmationPage.BACK_HOME_BTN)
        );
    }
}
