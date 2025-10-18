package org.sofka.glue;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.sofka.task.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SuccessPurchaseStepDef {

    private Scenario scenario;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("el usuario accede al sitio SauceDemo")
    public void elUsuarioAccedeAlSitioSauceDemo() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Roberth").attemptsTo(
                NavigateTo.sauceDemoPage()
        );
    }

    @And("inicia sesión con el usuario {string} y contraseña {string}")
    public void iniciaSesionConCredenciales(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginTask.withCredentials(username, password)
        );
    }

    @When("agrega los productos {string} y {string} al carrito")
    public void agregaProductosAlCarrito(String producto1, String producto2) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductsToCartTask.addSelectedItems()
        );
    }

    @And("visualiza el contenido del carrito")
    public void visualizaContenidoDelCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewCartTask.openCart()
        );
    }

    @And("procede al checkout e ingresa los datos: nombre {string}, apellido {string}, código postal {string}")
    public void completaFormularioCheckout(String firstName, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                StartCheckoutTask.begin(),
                FillCheckoutFormTask.withData(firstName, lastName, postalCode)
        );
    }

    @And("finaliza la compra")
    public void finalizaLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FinishPurchaseTask.confirm()
        );
    }

    @Then("debería ver el mensaje de confirmación {string}")
    public void validaMensajeDeConfirmacion(String expectedMessage) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ValidateConfirmationMessageTask.isVisible()
        );
    }

}
