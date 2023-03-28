package com.example.demo.Entity;

public class Product {
    private final String make;
    private final String name;
    private final int price;

    public Product(String make, String name, int price) {
        this.make = make;
        this.name = name;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}


