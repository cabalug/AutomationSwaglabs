package com.swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String page;

    public Login(String page) {
        this.page = page;
    }

    public static Login toThe(String page) {
        return instrumented(Login.class, page);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(page));
    }
}
