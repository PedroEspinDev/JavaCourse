package Repository;

import java.util.Scanner;

//Realiza un programa que pida por consola números enteros hasta que se introduzca el 0. Al
//finalizar mostrará la suma de todos ellos y cuántos se han introducido.

public class IntegerZeroApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num;
        int amount = 0;

        do {
            System.out.print("Introduce un número entero (0 para salir): ");
            num = sc.nextInt();

            if (num != 0) {
                suma += num;
                amount++;
            }
        } while (num != 0);

        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("Se han introducido " + amount + " números.");
    }
}
