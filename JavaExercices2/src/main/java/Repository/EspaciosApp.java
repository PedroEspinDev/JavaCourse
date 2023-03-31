package Repository;

import java.util.Scanner;

public class EspaciosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase cualquiera");
        String frase = sc.nextLine();
        String fraseSinEspacios=frase.replace( " ","");

        System.out.println(fraseSinEspacios);
    }



}
