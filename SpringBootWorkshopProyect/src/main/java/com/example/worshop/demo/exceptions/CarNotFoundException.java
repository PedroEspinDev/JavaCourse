package com.example.worshop.demo.exceptions;

public class CarNotFoundException extends CarException {
    public CarNotFoundException(Long id) {
        super("Car with id " + id + " not found.");
    }
}
