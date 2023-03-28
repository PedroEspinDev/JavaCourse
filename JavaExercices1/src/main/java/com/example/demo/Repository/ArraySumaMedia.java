package com.example.demo.Repository;

import javax.swing.*;

public class ArraySumaMedia {
    public static void main(String[] args) {

        int[] numeros = new int[0];

        int suma = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        System.out.println("La suma es " + suma);
        media = (double) suma / numeros.length;
        System.out.println("La media es " + media);

    }
}
