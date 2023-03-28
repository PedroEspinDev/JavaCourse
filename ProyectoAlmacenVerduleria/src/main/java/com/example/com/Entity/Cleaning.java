package com.example.com.Entity;

public class Cleaning extends Product {
    private final String components;
    private final double liters;

    public Cleaning(String components, double liters,Long id, String name, Double price) {
        super(id, name, price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;

    }

    public double getLiters() {
        return liters;

    }
}
