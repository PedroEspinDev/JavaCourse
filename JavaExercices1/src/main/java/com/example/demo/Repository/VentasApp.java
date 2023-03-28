package com.example.demo.Repository;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class VentasApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero de ventas: ");
        int numVentas = scanner.nextInt();

        int sumaVentas = 0;
        for (int i = 0; i < numVentas;i++){
            System.out.println("Introduzca el precio de las ventas: "+(i+1));
            int venta = scanner.nextInt();
            sumaVentas = sumaVentas + venta;
        }
        System.out.println("El total de las ventas asciende a: " + sumaVentas + " ventas.");
    }
}
