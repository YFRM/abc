package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.core.Serenity.getDriver;


public class ExitoCamasPage {

  public static final Target PRODUCTS = Target.the("ProductosAll").located(By.xpath("//ul[@data-fs-product-grid-type=\\\"hogar\\\"]/li/article/div[2]/div/button"));
  public static final Target CANTID_PROD = Target.the("CantidadProd").located(By.xpath("//button[@class='QuantitySelectorDefault_plus__1LAkq']"));
  public static final Target CARRO = Target.the("CarroDeCompras").located(By.xpath("//button[@aria-label=\"Cart toggle button\"]"));
}