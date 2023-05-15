package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class FindClosestWholeToDecimalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int numInteger = sc.nextInt();
        Double numDecimal = (double) Math.round(numInteger);

        System.out.println("Integer approximates : " + numInteger);
        System.out.println("Decimal number: " + numDecimal);
    }
}
