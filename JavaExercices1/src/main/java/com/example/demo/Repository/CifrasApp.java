package com.example.demo.Repository;

import java.util.Scanner;

public class CifrasApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Introduzca un numero ");
            numero = scanner.nextInt();
        } while (numero < 0);


    }
}
