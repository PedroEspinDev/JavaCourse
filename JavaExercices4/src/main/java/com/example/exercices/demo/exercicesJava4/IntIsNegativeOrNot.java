package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class IntIsNegativeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num1 = sc.nextInt();

        boolean isNegative = num1 <= 0;
        if (isNegative) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
