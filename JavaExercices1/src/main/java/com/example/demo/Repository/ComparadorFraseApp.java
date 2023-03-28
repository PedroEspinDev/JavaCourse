package com.example.demo.Repository;

import java.util.Scanner;

public class ComparadorFraseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.println("Introduzca la segunda palabra: ");
        String palabra2 = sc.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Resultado: Las palabras son iguales.");
        } else {
            System.out.println("Resultado: Las palabras son diferentes.");
        }
        String sumaPalabras = palabra1 + palabra2;
        String subcadena = sumaPalabras.substring(0,3);
        System.out.println("Los 3 primeros caracteres de la primera paralabra son: "+ subcadena);
    }
}