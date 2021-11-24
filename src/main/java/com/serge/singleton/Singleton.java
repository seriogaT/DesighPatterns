package com.serge.singleton;

public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
