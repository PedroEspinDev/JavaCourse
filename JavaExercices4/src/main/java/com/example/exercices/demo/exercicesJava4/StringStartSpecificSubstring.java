package com.example.exercices.demo.exercicesJava4;

public class StringStartSpecificSubstring {
    public static void main(String[] args) {
        String string = "Hello world";
        String substring = "heello";

        if (string.startsWith(substring)) {
            System.out.println("String does starts with substring ");
        } else {
            System.out.println("String does not starts with substring ");
        }
    }
}
