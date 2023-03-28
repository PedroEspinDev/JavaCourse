package com.example.demo.Repository;

import javax.swing.*;

public class CaracterASCIIApp {
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        char caracter = texto.charAt(0);
        int codigo = (int) caracter;

        System.out.println(codigo);
    }
}
