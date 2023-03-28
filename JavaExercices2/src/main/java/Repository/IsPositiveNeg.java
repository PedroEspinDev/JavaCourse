package Repository;

//Define la clase IsPositiveNeg que pide repetidas veces un numero entero por teclado e indica si es positivo o negativo.
//En caso de ser cero,se sale del programa diciendo "Adios!".
//Crea tres versiones con las tres estructudas repetitivas utilizando la sentencia break.

import java.util.Scanner;

public class IsPositiveNeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Introduce un número entero: ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Adiós!");
                break;
            } else if (num > 0) {
                System.out.println(num + " es positivo.");
            } else {
                System.out.println(num + " es negativo.");
            }
            do {
                System.out.print("Introduce un número entero: ");
                num = sc.nextInt();
                if (num == 0) {
                    System.out.println("Adiós!");
                    break;
                } else if (num > 0) {
                    System.out.println(num + " es positivo.");
                } else {
                    System.out.println(num + " es negativo.");
                }
            } while (true);

            for (; ; ) {
                System.out.print("Introduce un número entero: ");
                num = sc.nextInt();
                if (num == 0) {
                    System.out.println("Adiós!");
                    break;
                } else if (num > 0) {
                    System.out.println(num + " es positivo.");
                } else {
                    System.out.println(num + " es negativo.");
                }
            }
            sc.close();
        }
    }
}

