package com.example.demo.Repository;

import java.util.Scanner;

public class EcuacionApp {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce valor valor de a ");
        int a = scanner.nextInt();

        System.out.println("Introduce el valor de b ");
        int b = scanner.nextInt();

        System.out.println("Introduce el valor de c ");
        int c = scanner.nextInt();

        double discriminante = Math.pow(b, 2) - (4*a*c);
        System.out.println(">>" + discriminante);

        if (discriminante > 0 ){
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);

            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
}
