package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word or phrase: ");
        String palindrome = sc.nextLine();

        boolean isPalindrome = palindrome.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(new StringBuilder(palindrome).reverse().toString());

        if (isPalindrome) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
