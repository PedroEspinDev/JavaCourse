package Repository;

import java.util.Scanner;

public class SumaMaxApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un numero entero mayor a 1 ");
        int num;

        do {
            num = scanner.nextInt();
            if (num <= 1) {
                System.out.println("Error introduzca un numero correcto."
                        + "\n" + "Vuelva a intentarlo.");
            }
        } while (!(num >= 1));
        int suma = 0;
        for (int contador = 1; contador <= num; contador++) {
            suma += contador;
        }
        System.out.println("La suma es: " + suma);
    }
}

