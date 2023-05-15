package com.example.exercices.demo.exercicesJava4;

public class StringEqualString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        boolean areEqual = str1.equals(str2);
        if (areEqual) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}