package com.example.exercices.demo.exercicesJava4;

public class StringEmptyOrNot {
    public static void main(String[] args) {
        String string = "";

        //"isEmpty" return always false
        if (!string.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string it is not empty.");
        }
    }
}
