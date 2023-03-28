package Repository;

import java.util.Scanner;

public class Flowchart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tema;
        System.out.println("Do you know about the topic? (Yes/No) ");
        tema = sc.nextLine();
        tema = tema.toLowerCase();

        if (tema.equals("Yes")) {
            System.out.println("You are informed, you can speak.");

        } else if (tema.equals("No")) {

            do {
                System.out.println("You are not informed, inform yourself.");
                System.out.println("¿ Are you already informed? ? (Yes/No) ");
                tema = sc.nextLine();
                tema = tema.toLowerCase();

            } while (tema.equals("No"));

            System.out.println("You are informed,you can speak");
        }
    }
}
