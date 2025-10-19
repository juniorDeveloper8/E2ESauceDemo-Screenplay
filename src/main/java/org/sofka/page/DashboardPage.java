package org.sofka.page;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {

    public static final Target BACKPACK = Target.the("PRODUCTO MOCHILA")
            .locatedBy("#add-to-cart-sauce-labs-backpack");

    public static final Target JACKET = Target.the("PRODUCTO CHAQUETA")
            .locatedBy("#add-to-cart-sauce-labs-fleece-jacket");

    public static final Target CART_BUTTON = Target.the("BOTÓN DEL CARRITO DE COMPRAS")
            .locatedBy("[data-test='shopping-cart-link']");

    public static final Target CHECKOUT_BTN = Target.the("BOTÓN DE VALIDACIÓN DE COMPRAS")
            .locatedBy("#checkout");
}
