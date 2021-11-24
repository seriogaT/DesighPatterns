package com.serge.builder;

import lombok.*;

@Data
@Builder
@ToString
public class Car {

    private String model;
    private int year;
    private String color;
    private int maxSpeed;
}
