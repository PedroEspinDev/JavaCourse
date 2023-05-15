package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class NumEvenToBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one integer: ");
        int int1 = sc.nextInt();

        boolean isEven = int1 % 2 == 0;
        System.out.println("The number is even? " + isEven);

    }
}
