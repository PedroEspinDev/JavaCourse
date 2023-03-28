package com.example.demo.Repository;

import javax.swing.*;

public class EscaleraInversaApp {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Escribe una altura");
        int altura = Integer.parseInt(texto);
        dibujaEscaleraInversa(altura);
    }

    public static void dibujaEscaleraInversa(int altura) {
        for (int numeroasteriscos = altura; numeroasteriscos > 0; numeroasteriscos--) {

            for (int i = numeroasteriscos; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

