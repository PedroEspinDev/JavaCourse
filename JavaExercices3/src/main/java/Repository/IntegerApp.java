package Repository;

import java.util.Scanner;

//Realiza un programa que pida por consola números enteros hasta que la suma de todos ellos
//supere 100.

public class IntegerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num;

        while (suma <= 100) {
            System.out.println("Introduzca un numero entero: ");
            num = sc.nextInt();
            suma += num;
        }
        System.out.println("La suma total es: " + suma);
    }
}
