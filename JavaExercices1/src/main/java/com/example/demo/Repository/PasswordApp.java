package com.example.demo.Repository;

import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {

        String contraseña = "croquetas";
        Scanner scanner = new Scanner(System.in);

        final int intentos = 3;

        boolean acierto = false;
        String password;
        for (int i = 0;i<intentos && !acierto;i++){
            System.out.println("Introduce una contraseña: ");
            password = scanner.next();

            if ( password.equals(contraseña)){
                System.out.println("Enhorabuena,has acertado! ");
                acierto = true;
            }
        }
    }
}
