package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.ExitoHomePage;
import com.co.choucair.models.ExitoLoombokData;
import com.co.choucair.models.UserLoombokData;
import com.co.choucair.userinterfaces.ExitoHomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.HoverOverElement;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ExitoMenu implements Task {

    //UserLoombokData userLoombokData;

    /*public ExitoMenu(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }*/

    private Target BTN_MENU;
    private Target BTN_DORMITORIO;
    private Target BTN_CAMAS;


    public ExitoMenu(Target BTN_MENU,Target BTN_DORMITORIO,Target BTN_CAMAS) {
        this.BTN_MENU = BTN_MENU;
        this.BTN_DORMITORIO = BTN_DORMITORIO;
        this.BTN_CAMAS = BTN_CAMAS;
    }
    public static ExitoMenu hacerClick(Target BTN_MENU,Target BTN_DORMITORIO, Target BTN_CAMAS){
        return new ExitoMenu(BTN_MENU,BTN_DORMITORIO,BTN_CAMAS);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_MENU),
                WaitUntil.the(BTN_DORMITORIO, isVisible()).forNoMoreThan(10).seconds(),
                HoverOverElement.over(BTN_DORMITORIO),
                WaitUntil.the(BTN_CAMAS, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(ExitoHomePage.BTN_CAMAS)

        );

    }


}



