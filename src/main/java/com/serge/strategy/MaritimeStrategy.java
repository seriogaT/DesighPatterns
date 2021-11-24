package com.serge.strategy;

public class MaritimeStrategy implements ShippingStrategy {
    @Override
    public String applyShippingStrategy(Country fromCountry, Country toCountry) {
        return "The package will be sent by boat from: " + fromCountry + " to " + toCountry;
    }
}
