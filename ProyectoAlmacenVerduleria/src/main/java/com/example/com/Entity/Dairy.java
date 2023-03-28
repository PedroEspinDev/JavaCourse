package com.example.com.Entity;

public class Dairy extends Product {
    private final int amount;
    private final int proteins;

    public Dairy(int amount, int proteins, Long id, String name, Double price) {
        super(id, name, price);
        this.amount = amount;
        this.proteins = proteins;

    }

    public int getAmount() {
        return amount;

    }

    public int getProteins() {
        return proteins;

    }
}
