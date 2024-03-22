package com.swaglabs.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    public static final Target TITLE = Target.the("{0} title")
            .located(By.cssSelector(".product_label"));
}
