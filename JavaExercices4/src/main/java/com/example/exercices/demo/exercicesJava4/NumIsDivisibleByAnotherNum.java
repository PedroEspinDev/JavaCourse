package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class NumIsDivisibleByAnotherNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to divide: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the number that divides: ");
        int num2 = sc.nextInt();

        boolean result = num1 % num2 == 0;
        if (result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
