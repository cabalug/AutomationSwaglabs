package com.swaglabs.tasks;

import com.swaglabs.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.swaglabs.enums.Messages.PRODUCT_PAGE_TITLE;
import static com.swaglabs.enums.PageConfiguration.LOGIN_PAGE;
import static com.swaglabs.ui.LoginPage.*;
import static com.swaglabs.ui.ProductPage.TITLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Authenticate implements Task {

    private final User user;

    public Authenticate(User user) {
        this.user = user;
    }

    public static Authenticate withInfo(User user) {
        return instrumented(Authenticate.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(LOGIN_PAGE.getPath())
                        .then(Enter.theValue(user.getUsername()).into(USERNAME))
                        .then(Enter.theValue(user.getPassword()).into(PASSWORD))
                        .then(Click.on(LOGIN))
        );
    }
}
