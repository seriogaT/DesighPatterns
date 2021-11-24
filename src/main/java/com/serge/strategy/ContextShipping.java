package com.serge.strategy;

public class ContextShipping {

    ShippingStrategy shippingStrategy;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public String submitShippingMethod(Country fromCountry, Country toCountry) {
        return shippingStrategy.applyShippingStrategy(fromCountry, toCountry);
    }
}
