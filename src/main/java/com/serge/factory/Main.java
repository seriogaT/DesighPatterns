package com.serge.factory;

import static com.serge.factory.TransportType.CYCLE;
import static com.serge.factory.TransportType.PLANE;

public class Main {


    public static void main(String[] args) {

        TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.createTransport(TransportType.SHIP);
        transport.startEngine();
        ((Ship)transport).stopEngine();

        Plane plane = (Plane)transportFactory.createTransport(PLANE);
        plane.startEngine();
        plane.stopEngine();

        Transport cycle = transportFactory.createTransport(CYCLE);


    }
}
