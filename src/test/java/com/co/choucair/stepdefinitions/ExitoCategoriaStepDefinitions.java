package com.co.choucair.stepdefinitions;

import com.co.choucair.models.ExitoLoombokData;
import com.co.choucair.models.ObtenerNombreProducto;
import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.ValidateText;
import com.co.choucair.tasks.*;
import com.co.choucair.userinterfaces.ExitoHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.HoverOverElement;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


import javax.xml.crypto.Data;

import java.util.Arrays;
import java.util.List;

import static com.co.choucair.userinterfaces.ExitoHomePage.*;
import static com.co.choucair.userinterfaces.SerenityLoginPage.TXT_VALIDATION;
import static com.co.choucair.utils.GlobalData.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class ExitoCategoriaStepDefinitions {

    @Given("Que ingreso a la página de Tiendas Éxito")
    public void queIngresoALaPáginaDeTiendasÉxito() {
        ACTOR.attem.wasAbleTo(Open.url(URL3));
    }
    @When("Elijo una categoría y una subcategoría")
    public void elijoUnaCategoríaYUnaSubcategoría() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ExitoMenu.hacerClick(
                        BTN_MENU,
                        BTN_DORMITORIO,
                        BTN_CAMAS)
        );
    }

    @When("Elijo productos al azar y cantidad de producto")
    public void elijoProductosAlAzar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ExitoCamas2.seleccionarProductosAzar(PRODUCTS),
                ExitoCamas2.seleccionarCantiProdAzar(CANTID_PROD),
                ExitoCamas.seleccionarCarro(CARRO)

                //PruebaCamas.aleatorios(PRODUCTS)
                //ExitoCamas.seleccionarProductosAzar(PRODUCTS),
                //ExitoCamas.seleccionarCantiProdAzar(CANTID_PROD)
        );
        /*String textoProducto = theActorInTheSpotlight().asksFor(Text.of(ExitoHomePage.PRODUCTS).asString());
        ObtenerNombreProducto.setCapturarTexto(textoProducto);
        //OnStage.theActorInTheSpotlight().attemptsTo(Prueba2.aleatorios2(CANTID_PROD));
        String textoOtroElemento = theActorInTheSpotlight().asksFor(Text.of(ExitoHomePage.CARRO_VALIDAR).asString());
        assert (textoOtroElemento).equals(ObtenerNombreProducto.getCapturarTexto());*/

    }
  /*  @And("Elijo cantidad de productos al azar")
    public void elijoCantidadDeProductosAlAzar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
         //       Prueba2.aleatorios2(CANTID_PROD)
        );
    }*/

    @Then("se deben agregar los productos al carrito correctamente")
    public void seDebenAgregarLosProductosAlCarritoCorrectamente(String text) {
       // OnStage.theActorInTheSpotlight().should(seeThat(ValidateText.of(TXT_VALIDATION), containsString(text)));

        String textoProducto = theActorInTheSpotlight().asksFor(Text.of(ExitoHomePage.PRODUCTS).asString());
        ObtenerNombreProducto.setCapturarTexto(textoProducto);
        //OnStage.theActorInTheSpotlight().attemptsTo(Prueba2.aleatorios2(CANTID_PROD));
        String textoOtroElemento = theActorInTheSpotlight().asksFor(Text.of(ExitoHomePage.CARRO_VALIDAR).asString());
        assert (textoOtroElemento).equals(ObtenerNombreProducto.getCapturarTexto());

    }
    @Then("el nombre de los productos en el carrito debe ser verificado")
    public void elNombreDeLosProductosEnElCarritoDebeSerVerificado() {

    }
    @Then("el total de los precios de los productos en el carrito debe ser verificado")
    public void elTotalDeLosPreciosDeLosProductosEnElCarritoDebeSerVerificado() {

    }
    @Then("las cantidades de los productos en el carrito deben ser verificadas")
    public void lasCantidadesDeLosProductosEnElCarritoDebenSerVerificadas() {

    }
    @Then("el número de productos agregados al carrito debe ser verificado")
    public void elNúmeroDeProductosAgregadosAlCarritoDebeSerVerificado() {

    }


}
