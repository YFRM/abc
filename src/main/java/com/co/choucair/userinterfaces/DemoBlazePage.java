package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazePage {

    public static final Target btnSignUp = Target.the("txt").located(By.id("signin2"));
    public static final Target btnLogin = Target.the("txt").located(By.id("login2"));
    public static final Target txtUser = Target.the("txt").located(By.id("sign-username"));
    public static final Target txtPass = Target.the("txt").located(By.id("sign-password"));
    public static final Target txtUserLogin = Target.the("txt").located(By.id("loginusername"));
    public static final Target txtPassLogin = Target.the("txt").located(By.id("loginpassword"));
    public static final Target btnContR = Target.the("txt").located(By.xpath("//button[@onclick='register()']"));
    public static final Target btnContL = Target.the("txt").located(By.xpath("//button[@onclick='register()']"));

}
