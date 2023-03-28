package com.example.demo.Repository;

import javax.swing.*;

public class SaludoApp {
    public static void main(String[]args){

        String nombre = JOptionPane.showInputDialog(null," Por favor introduzca su nombre");
        String saludo = "Bienvenido " + nombre;
        JOptionPane.showInputDialog(null, saludo );
    }
}