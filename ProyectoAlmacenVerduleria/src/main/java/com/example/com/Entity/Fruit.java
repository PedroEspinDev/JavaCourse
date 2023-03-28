package com.example.com.Entity;

public class Fruit extends Product {
    private final double weight;
    private final String color;

    public Fruit(double weight, String color,Long id, String name, Double price) {
        super(id, name, price);
        this.weight = weight;
        this.color = color;
    }

    public Double getWeight() {
        return weight;

    }

    public String getColor() {
        return color;
    }
}

