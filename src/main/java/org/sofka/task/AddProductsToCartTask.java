package org.sofka.task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sofka.page.DashboardPage;

import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductsToCartTask implements Task {
    public static AddProductsToCartTask addSelectedItems() {
        return new AddProductsToCartTask();
    }

    @Override
    @Step("{0} agrega productos al carrito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                the(DashboardPage.BACKPACK, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DashboardPage.BACKPACK),

                the(DashboardPage.JACKET, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DashboardPage.JACKET),

                the(DashboardPage.CART_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DashboardPage.CART_BUTTON)
        );
    }
}
