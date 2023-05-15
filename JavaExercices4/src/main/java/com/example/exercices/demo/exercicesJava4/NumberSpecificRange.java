package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class NumberSpecificRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer (0-20): ");
        int num1 = sc.nextInt();

        int startingRange = 0;
        int finalRange = 20;

        boolean isInRange = num1 >= startingRange && num1 <= finalRange;
        if (isInRange) {
            System.out.println(" The number is in range.");
        } else {
            System.out.println("The number is not in range.");
        }
    }
}
