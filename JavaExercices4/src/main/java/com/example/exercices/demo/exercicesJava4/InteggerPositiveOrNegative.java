package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class InteggerPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one integer: ");
        int int1 = sc.nextInt();

        if (int1 < 0) {
            System.out.println("The number is negative");
        } else if (int1 == 0) {
            System.out.println("This number is neutral");
        } else
            System.out.println("The number is positive");
    }
}


