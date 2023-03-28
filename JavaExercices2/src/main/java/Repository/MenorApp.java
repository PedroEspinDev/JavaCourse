package Repository;

import java.util.Scanner;

public class MenorApp {
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
            if (num1 < num2) {
                System.out.println("El menor es: " + num1);
            } else {
                System.out.println("El menor es: " + num2);
            }
        }
    }
}