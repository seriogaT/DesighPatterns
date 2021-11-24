package com.serge.builder;

public class Main {
    public static void main(String[] args) {

        Car car = Car.builder().
                model("BMW")
                .build();

        Car car1 = Car.builder().
                model("Mercedes")
                .color("black")
                .maxSpeed(200)
                .year(2021)
                .build();

        System.out.println(car);
        System.out.println(car1);

        car1.setYear(1111);
        System.out.println(car1);

    }
}
