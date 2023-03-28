package Repository;

import java.util.Scanner;

//Define la clase ExchangeApp que pide dos enteros por teclado e intercambia el valor de ambas variables.
//Muestra el valor antes y después del intercambio.

public class ExchangeApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingresa el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Antes del intercambio ---> primer numero: " + num1 + ", segundo numero: " + num2);

        int change = num1;
        num1 = num2;
        num2 = change;

        System.out.println("Despues del intercambio ---> primer numero: " + num1 + ", segundo numero: " + num2);
    }
}
