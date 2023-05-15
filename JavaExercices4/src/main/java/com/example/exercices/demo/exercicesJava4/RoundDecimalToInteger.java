package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class RoundDecimalToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double numDecimal = sc.nextDouble();
        int numInteger;
        numInteger = (int) Math.round(numDecimal);

        System.out.println("Decimal number: " + numDecimal);
        System.out.println("Integer approximates : " + numInteger);
    }
}
