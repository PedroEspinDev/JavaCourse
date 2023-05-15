package com.example.exercices.demo.exercicesJava4;

public class StringContainsSubstring {
    public static void main(String[] args) {
        String string = "Hello world";
        String substring = "wor";

        boolean result = string.contains(substring);
        if (result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
