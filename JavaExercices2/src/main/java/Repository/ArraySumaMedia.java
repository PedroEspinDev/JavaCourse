package Repository;

import javax.swing.*;

public class ArraySumaMedia {
    public static void main(String[] args) {

        //Creo un array
        int[] numeros = new int[0];

        //Declaro las variables necesarias
        int suma = 0;
        double media;

        //Recorro el array, asigno números y sumo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        //Calculo la media y muestro la suma y la media
        System.out.println("La suma es " + suma);

        media = (double) suma / numeros.length;

        System.out.println("La media es " + media);

    }
}
