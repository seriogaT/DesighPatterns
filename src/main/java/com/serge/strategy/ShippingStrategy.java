package com.serge.strategy;

public interface ShippingStrategy {

    String applyShippingStrategy(Country fromCountry, Country toCountry);
}
