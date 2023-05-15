package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class InteggerNumbersToBoolean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one integer: ");
        int num1= scanner.nextInt();
        System.out.println("Enter another integer: ");
        int num2 = scanner.nextInt();

        boolean result = num1 == num2;
        System.out.println("The result is "+ result);
    }
}
