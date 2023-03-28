package Repository;

import java.util.Scanner;

//Define la clase LogginApp que simule el acceso a un sitio en función de dos valores introducidos por el usuario: edad del ususario y autorización paterna.
//Sólo aparecerá el mensaje "Bienvenido" si el usuario es mayor de edad o si siendo menor de edad tiene la autorización paterna.
//En cualquiero otro caso,que muestre "Acceso denegado".

public class LogginApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please,enter age: ");
        int age = sc.nextInt();
        System.out.println("Do you have parental consent? (y/n): ");
        String authorization = sc.next();

        if (age >= 18 || authorization.equals("y")) {
            System.out.println("WELCOME!");
        } else {
            System.out.println("Sorry,access denied");
        }
    }
}
