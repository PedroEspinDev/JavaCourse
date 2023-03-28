package com.example.demo.Repository;

import java.util.Scanner;

public class DoWhileApp {
    public static void main(String[]args){

        int codigo;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Introduzca un numero mayor que 0: ");
            codigo = scanner.nextInt();
        }while(codigo <=0);
        System.out.println(codigo);
    }
}
