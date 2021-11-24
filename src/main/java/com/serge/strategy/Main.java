package com.serge.strategy;

import static com.serge.strategy.Country.DE;
import static com.serge.strategy.Country.MD;

public class Main {
    public static void main(String[] args) {

        ContextShipping contextShipping = new ContextShipping();
        MaritimeStrategy maritimeStrategy = new MaritimeStrategy();
        contextShipping.setShippingStrategy(maritimeStrategy);
        System.out.println(contextShipping.submitShippingMethod(DE, MD));
    }
}
