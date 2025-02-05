package com.co.choucair.tasks;

import com.co.choucair.models.ObtenerNombreProducto;
import com.co.choucair.userinterfaces.ExitoCamasPage;
import com.co.choucair.userinterfaces.ExitoHomePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverElement;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ExitoCamas2 implements Task {

    private Target PRODUCTS;
    private final Target BOTON_INCREMENTO = ExitoCamasPage.CANTID_PROD;
    private final Target CARRO = ExitoHomePage.CARRO;
    public ExitoCamas2(Target PRODUCTS) {
        this.PRODUCTS = PRODUCTS;

    }

    public static ExitoCamas2 seleccionarProductosAzar(Target PRODUCTS){
        return new ExitoCamas2(PRODUCTS);
    }

    public static ExitoCamas2 seleccionarCantiProdAzar(Target BOTON_INCREMENTO){

        return new ExitoCamas2(BOTON_INCREMENTO);
    }
    public static ExitoCamas2 seleccionarCarro(Target CARRO){

        return new ExitoCamas2(CARRO);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PRODUCTS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PRODUCTS),
                WaitUntil.the(BOTON_INCREMENTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_INCREMENTO));
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













