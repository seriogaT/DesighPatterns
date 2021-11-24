package com.serge.composite;

public class ReceptionDepartment implements Department {
    private int id;
    private String name;

    public ReceptionDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void showDepartment() {
        System.out.println(id + " " + name + " " + getClass().getSimpleName());
    }
}
