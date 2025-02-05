package com.co.choucair.tasks;

import com.co.choucair.models.ObtenerNombreProducto;
import com.co.choucair.userinterfaces.ExitoCamasPage;
import com.co.choucair.userinterfaces.ExitoHomePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

import static com.ibm.icu.text.PluralRules.Operand.e;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ExitoCamas implements Task {

    private Target PRODUCTS;
    private final Target BOTON_INCREMENTO = ExitoCamasPage.CANTID_PROD;
    private final Target CARRO = ExitoHomePage.CARRO;
    public ExitoCamas(Target PRODUCTS) {
        this.PRODUCTS = PRODUCTS;

    }

    public static ExitoCamas seleccionarProductosAzar(Target PRODUCTS){
        return new ExitoCamas(PRODUCTS);
    }

    public static ExitoCamas seleccionarCantiProdAzar(Target BOTON_INCREMENTO){

        return new ExitoCamas(BOTON_INCREMENTO);
    }
    public static ExitoCamas seleccionarCarro(Target CARRO){

        return new ExitoCamas(CARRO);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productos = PRODUCTS.resolveAllFor(actor);
        Collections.shuffle(productos);

        for (int i = 0; i < 1 && i < productos.size(); i++) {
            WebElementFacade producto = productos.get(i);
                actor.attemptsTo(
                        WaitUntil.the(PRODUCTS, isClickable()).forNoMoreThan(40).seconds(),
                        Click.on(producto)
                );

        }
        Random random = new Random();
        int cantidad = random.nextInt(2) + 1;
        int clicksRealizados = 0;
        while (clicksRealizados < cantidad) {

                actor.attemptsTo(
                        WaitUntil.the(BOTON_INCREMENTO, isClickable()).forNoMoreThan(40).seconds(),
                        Click.on(BOTON_INCREMENTO)
                );
                clicksRealizados++;

                if (clicksRealizados >= 2) {
                    System.out.println("Se ha alcanzado el límite de 10 clics.");
                    break;
                }

        }
        //actor.attemptsTo(Click.on(CARRO)

        //);

        //String textoProducto = theActorInTheSpotlight().asksFor(Text.of(ExitoHomePage.PRODUCTS).asString());
        //ObtenerNombreProducto.setCapturarTexto(textoProducto);
    }


 /*
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productos = PRODUCTS.resolveAllFor(actor);
        Collections.shuffle(productos);

        for (int i = 0; i < 5 && i < productos.size(); i++) {
            WebElementFacade producto = productos.get(i);

            try {
                actor.attemptsTo(

                        WaitUntil.the(PRODUCTS, isClickable()).forNoMoreThan(20).seconds(),
                        Click.on(producto)
                );
                Random random = new Random();
                int cantidad = random.nextInt(10) + 1;
                int clicksRealizados = 0;
                while (clicksRealizados < cantidad) {
                    try {
                        actor.attemptsTo(
                                WaitUntil.the(BOTON_INCREMENTO, isClickable()).forNoMoreThan(20).seconds(),
                                Click.on(BOTON_INCREMENTO)
                        );
                        clicksRealizados++;

                        if (clicksRealizados >= 10) {
                            System.out.println("Se ha alcanzado el límite de 10 clics.");
                            break;
                        }
                    } catch (StaleElementReferenceException e) {
                        System.out.println("El botón de incremento se volvió obsoleto, intentando de nuevo.");
                        // Reintentar el clic en el botón de incremento
                    } catch (Exception e) {
                        System.out.println("Error al hacer clic en el botón de incremento: " + e.getMessage());
                    }
                }
            } catch (Exception e) {
                System.out.println("Error al interactuar con el producto: " + e.getMessage());
            }
        }
    } */

   /*  USAR ESTE anidado
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productos = PRODUCTS.resolveAllFor(actor);
        Collections.shuffle(productos);

        for (int i = 0; i < 5 && i < productos.size(); i++) {
            WebElementFacade producto = productos.get(i);

            try {
                actor.attemptsTo(
                        WaitUntil.the(PRODUCTS, isClickable()).forNoMoreThan(20).seconds(),
                        WaitUntil.the(PRODUCTS, isClickable()).forNoMoreThan(20).seconds(),
                        Click.on(producto)
                );

                // Seleccionar una cantidad aleatoria entre 1 y 10 para el número de clics
                Random random = new Random();
                int cantidad = random.nextInt(10) + 1;

                IntStream.range(0, cantidad).limit(10).forEach(j -> {
                    try {

                        actor.attemptsTo(
                                WaitUntil.the(BOTON_INCREMENTO, isVisible()).forNoMoreThan(20).seconds(),
                                WaitUntil.the(BOTON_INCREMENTO, isClickable()).forNoMoreThan(20).seconds(),
                                Click.on(BOTON_INCREMENTO)
                        );
                    } catch (StaleElementReferenceException e) {
                        System.out.println("El botón de incremento se volvió obsoleto, intentando de nuevo.");
                    } catch (Exception e) {
                        System.out.println("Error al hacer clic en el botón de incremento: " + e.getMessage());
                    }
                });
            } catch (ElementClickInterceptedException e) {
                System.out.println("Error al interactuar con el producto: " + e.getMessage());
            }
        }
    }
*/

}













