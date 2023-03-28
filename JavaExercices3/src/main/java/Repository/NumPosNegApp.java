package Repository;

//Realiza un programa que lea desde consola números enteros hasta que se meta el 0 ó el 666.
//Al acabar el programa indicará cuántos de los números introducidos han sido positivos,
//cuántos negativos, y cuántos en total (excluyendo el 0 y el 666).

import java.util.Scanner;

public class NumPosNegApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int counterPositives = 0;
        int counterNegatives = 0;
        int totalCounter = 0;
        boolean continueReading = true;

        while (continueReading) {
            System.out.println("Introduce un numero entero (0 o 666 para salir): ");
            num = sc.nextInt();

            if (num == 0 || num == 666) {
                continueReading = false;
            } else {
                totalCounter++;
                if (num > 0) {
                    counterPositives++;
                } else {
                    counterNegatives++;
                }
            }
        }
        System.out.println("Numeros positivos: " + counterPositives);
        System.out.println("Numeros negativos: " + counterNegatives);
        System.out.println("Total de numeros leidos : " + totalCounter);
    }
}
