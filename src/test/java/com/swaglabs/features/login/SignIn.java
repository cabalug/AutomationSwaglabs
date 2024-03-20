package com.swaglabs.features.login;

import com.swaglabs.tasks.Login;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.swaglabs.enums.PageConfiguration.LOGIN_PAGE;

@ExtendWith(SerenityJUnit5Extension.class)
public class SignIn {

    @CastMember(name = "Luis")
    Actor user;

    @Test
    public void loginAsStandardUser() {
        user.attemptsTo(Login.toThe(LOGIN_PAGE.getPath()));
    }
}