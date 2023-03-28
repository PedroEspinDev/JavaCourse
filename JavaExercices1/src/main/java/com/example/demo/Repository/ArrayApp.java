package com.example.demo.Repository;

import javax.swing.*;

public class ArrayApp {
    public static void main(String[] args) {

        final int tamanio = 5;
        int num[] = new int[tamanio];
        rellenarArray(num);
        mostrarArray(num);
    }

    public static void rellenarArray(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            String texto = JOptionPane.showInputDialog("Introduce un numero");
            lista[i] = Integer.parseInt(texto);
        }
    }

    public static void mostrarArray(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}
