package org.sofka.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.sofka.page.ConfirmationPage;

public class ConfirmationMessage {

    public static Question<String> text() {
        return Text.of(ConfirmationPage.CONFIRMATION_HEADER).asString();
    }

}
