package com.example.demo.Repository;

import javax.lang.model.SourceVersion;
import java.util.Locale;
import java.util.Scanner;

public class MayusMinusApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca una frase");
        String frase = sc.nextLine();

        System.out.println("Seleccione una opción: ");
        System.out.println("Seleccione 1 para mayusculas");
        System.out.println("Seleccione 2 para minusculas");
        int opcion = sc.nextInt();

        String resultado = "";

        if (opcion == 1) {
            resultado = frase.toUpperCase();
        } else if (opcion == 2) {
            resultado = frase.toLowerCase();
        } else {
        }
        System.out.println("Resultado: " + resultado);
        System.out.println("La frase tiene una cantidad de: " + resultado.length() + " caracteres.");
    }
}
