package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class GetMaxTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another integer: ");
        int num2 = sc.nextInt();

        if (num1 >= num2) {
            System.out.println("The number " + num1 + " is greater than " + num2);
        } else {
            System.out.println("The number " + num2 + " is greater than " + num1);
        }
    }
}
