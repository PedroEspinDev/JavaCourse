package com.example.demo.Repository;

import javax.swing.*;

public class EscaleraNumeroApp {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Escriba una altura");
        int altura=Integer.parseInt(texto);
        dibujarEscaleraNum(altura);
    }

    public static void dibujarEscaleraNum(int altura) {
        for (int numero = 1; numero <= altura; numero++) {

            for (int i = 1; i < numero; i++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
