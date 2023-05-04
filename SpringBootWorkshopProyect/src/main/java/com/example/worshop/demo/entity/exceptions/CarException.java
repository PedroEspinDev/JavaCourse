package com.example.worshop.demo.entity.exceptions;
public class CarException extends RuntimeException {
    public CarException(String message) {
        super("Car not found.");
    }

    public CarException(String message, Throwable cause) {
        super("Car not found.", cause);
    }
}

