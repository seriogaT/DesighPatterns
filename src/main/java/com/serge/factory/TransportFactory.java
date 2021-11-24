package com.serge.factory;

public class TransportFactory {

    public Transport createTransport(TransportType transportType) {

        switch (transportType) {
            case SHIP:
                return new Ship();
            case PLANE:
                return new Plane();
            case TRUCK:
                return new Truck();
            default:
                throw new RuntimeException("Invalid transport type: " + transportType);
        }
    }
}
