package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class StringIsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        boolean isInt = false;
        try {
            int num = Integer.parseInt(str);
            isInt = true;
        } catch (NumberFormatException e) {

        }
        System.out.println("The entered string " + (isInt ? "is" : "not is") + " a number integer.");
    }
}