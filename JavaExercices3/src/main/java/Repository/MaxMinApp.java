package Repository;

//Realiza un programa que lea desde consola 5 números enteros. El programa mostrará el
//máximo y el mínimo introducidos.

import java.util.Scanner;

public class MaxMinApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce el número #" + i + ": ");
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);
    }
}
