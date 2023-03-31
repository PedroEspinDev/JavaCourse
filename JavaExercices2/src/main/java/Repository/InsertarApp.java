package Repository;

import java.util.Scanner;

public class InsertarApp {
    public static void main(String[] args) {
        //coger numero hasta que insertemos -1 entonces tendremos que saber cuantos numero hemos intrloducido

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero ");
        int numero;
        int count = 0;
        do {
            numero = sc.nextInt();
            count += 1;
            System.out.println(numero + " numeros introducidos " + count);
        } while (numero != -1 && count < 5);
        System.out.println(" numeros introducidos " + count);
    }
}
