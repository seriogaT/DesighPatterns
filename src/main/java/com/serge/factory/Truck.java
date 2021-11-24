package com.serge.factory;

public class Truck implements Transport {

    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }
}
