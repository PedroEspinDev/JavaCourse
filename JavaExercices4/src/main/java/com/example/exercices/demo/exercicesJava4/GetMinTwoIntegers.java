package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class GetMinTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another integer: ");
        int num2 = sc.nextInt();

        if (num1 >= num2) {
            System.out.println("The number " + num2 + " is less than " + num1);
        } else {
            System.out.println("The number " + num1 + " is less than " + num2);
        }
    }
}

