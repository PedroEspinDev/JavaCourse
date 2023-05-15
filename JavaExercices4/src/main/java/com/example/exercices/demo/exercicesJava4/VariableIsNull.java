package com.example.exercices.demo.exercicesJava4;

public class VariableIsNull {
    public static void main(String[] args) {
        String variable = null;

        boolean result = variable == null;

        if (result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
