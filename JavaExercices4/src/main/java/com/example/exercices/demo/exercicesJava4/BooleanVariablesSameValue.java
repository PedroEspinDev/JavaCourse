package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class BooleanVariablesSameValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();

        boolean result = num1 == num2;
        System.out.println(result);
    }
}
