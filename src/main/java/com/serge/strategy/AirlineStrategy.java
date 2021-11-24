package com.serge.strategy;

public class AirlineStrategy implements ShippingStrategy {
    @Override
    public String applyShippingStrategy(Country fromCountry, Country toCountry) {
        return "The package will be sent by air from: " + fromCountry + " to " + toCountry;
    }
}
