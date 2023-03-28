package com.example.demo.Repository;

import javax.swing.*;

public class ImpuestoApp {
    public static void main(String[] args) {

        final double IVA = 0.21;

        String texto = JOptionPane.showInputDialog("Por favor introduzca precio del producto");
        double precio = Double.parseDouble(texto);

        double precioTotal = precio + (precio * IVA);
        System.out.println("El precio con IVA es de: " + precioTotal);
    }
}