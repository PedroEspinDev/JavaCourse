package Repository;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class CalculadoraPolacaInversaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double operador1;
        double operador2;
        double resultado = 0;

        System.out.println("Introduce el primer operador: ");
        operador1 = scanner.nextInt();

        System.out.println("Introduce el simbolo de operacion: ");
        String simbolo = scanner.next();

        System.out.println("Introduce el segundo operador: ");
        operador2= scanner.nextInt();

        switch (simbolo){
            case "+":
                resultado = operador1 + operador2;
                break;
            case "-":
                resultado = operador1 - operador2;
                break;
            case "*":
                resultado = operador1 * operador2;
                break;
            case "/":
                resultado = operador1 / operador2;
                break;
            case "^":
                resultado=(int)Math.pow(operador1, operador2);
                break;
            case "%":
                resultado = operador1 % operador2;
                break;
        }
        System.out.println(operador1 + " " + simbolo + " " + operador2 + "=" + resultado);
    }
}
