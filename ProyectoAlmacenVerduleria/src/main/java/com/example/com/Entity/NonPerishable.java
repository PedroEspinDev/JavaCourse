package com.example.com.Entity;

public class NonPerishable extends Product {
    private final int content;
    private final int calories;

    public NonPerishable(int content, int calories, Long id, String name, Double price) {
        super(id, name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;

    }
    public int getCalories() {
        return calories;

    }

}
