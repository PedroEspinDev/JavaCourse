package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class IfLeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeaf = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeaf) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
