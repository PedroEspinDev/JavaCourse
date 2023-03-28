package Repository;

import java.util.Scanner;

//Define la clase Mayor que pide repetidas veces dos enteros por teclado e indica cuál es el mayor.
//En caso de ser ambos numeros iguales se sale del programa diciendo Adios!.
//Utiliza la sentencia break.

public class MayorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        while (true) {
            System.out.println("Ingresa el primer numero: ");
            num1 = sc.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Adios!");
                break;
            }
            if (num1 > num2) {
                System.out.println("El mayor " + num1);
            } else {
                System.out.println("El mayor " + num2);
            }
        }
    }
}
