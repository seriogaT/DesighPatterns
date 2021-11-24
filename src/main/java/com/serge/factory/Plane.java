package com.serge.factory;

public class Plane implements Transport {

    @Override
    public void startEngine() {
        System.out.println("Plane engine started");
    }
    public void stopEngine() {
        System.out.println("Plane engine stopped");
    }
}
