package com.example.demo.Repository;

public class NumMayorApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        if (num1 >= num2) {
            if (num1 == num2) {
                System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales");
            } else {
                System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
            }
        } else {
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
        }
    }
}

