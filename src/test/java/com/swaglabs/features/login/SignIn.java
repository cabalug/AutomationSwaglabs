package com.swaglabs.features.login;

import com.swaglabs.models.User;
import com.swaglabs.tasks.Authenticate;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.swaglabs.enums.Messages.LOGIN_ERROR_MESSAGE;
import static com.swaglabs.enums.Messages.PRODUCT_PAGE_TITLE;
import static com.swaglabs.ui.LoginPage.ERROR_MESSAGE;
import static com.swaglabs.ui.ProductPage.TITLE;

@ExtendWith(SerenityJUnit5Extension.class)
public class SignIn {

    @CastMember(name = "Luis")
    Actor luis;

    @Test
    public void loginAsStandardUser() {
        User user = new User("standard_user", "secret_sauce");
        luis.attemptsTo(
                Authenticate.withInfo(user)
        );

        luis.attemptsTo(
                Ensure.that(TITLE).text().isEqualTo(PRODUCT_PAGE_TITLE.getPath())
        );
    }

    @Test
    public void loginAsLockedOutUser() {
        User user = new User("locked_out_user", "secret_sauce");
        luis.attemptsTo(
                Authenticate.withInfo(user)
        );

        luis.attemptsTo(
                Ensure.that(ERROR_MESSAGE).text().isEqualTo(LOGIN_ERROR_MESSAGE.getPath())
        );
    }
}