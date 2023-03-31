package Repository;

import java.util.Scanner;

public class PrimoApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("El numero intrducido" + numero + " no es primo");
        } else {

            int raiz = (int) Math.sqrt(numero);
            int contador = 0;
            for (int i = raiz; i > 1; i--) {
                if (numero % i == 0) {
                    contador++;
                }
            }
            System.out.println(">> " + contador);

            if (contador < 1) {
                System.out.println("El numero " + numero + " es primo");
            } else {
                System.out.println("El numero " + numero + " no es primo");
            }
        }
    }
}

