package com.swaglabs.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME = Target.the("{0} username")
            .located(By.cssSelector("#user-name"));

    public static final Target PASSWORD = Target.the("{0} password")
            .located(By.cssSelector("#password"));

    public static final Target LOGIN = Target.the("{0} login button")
            .located(By.cssSelector("#login-button"));

    public static final Target ERROR_MESSAGE = Target.the("{0} error message")
            .located(By.cssSelector("h3"));
}
