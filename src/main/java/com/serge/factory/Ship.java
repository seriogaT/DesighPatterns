package com.serge.factory;

public class Ship implements Transport {

    @Override
    public void startEngine() {

        System.out.println("Ship engine started");
    }

    public void stopEngine() {

        System.out.println("Ship engine stopped");
    }
}
