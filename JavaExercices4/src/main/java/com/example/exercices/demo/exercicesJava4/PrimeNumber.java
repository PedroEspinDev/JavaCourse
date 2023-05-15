package com.example.exercices.demo.exercicesJava4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        boolean isPrime = isNumPrime(num);

        System.out.println(num + (isPrime ? " is a number prime." : " not is a number prime."));
    }

    public static boolean isNumPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
