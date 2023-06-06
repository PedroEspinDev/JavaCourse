package Repository;

import java.util.Scanner;

//Request the entry of any of these words (casa, mesa, perro, gato) then show the word translated in English.
// That is, if 'house' is entered we must display the text 'house' on the page.
public class WordApp {
    public static void main(String[] args) {

        String word = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a world (casa, mesa, perro, gato): ");
        word = sc.nextLine();

        switch (word.toLowerCase()) {
            case "casa":
                System.out.println("House");
                break;
            case "mesa":
                System.out.println("Table");
                break;
            case "perro":
                System.out.println("Dog");
                break;
            case "gato":
                System.out.println("Cat");
                break;
            default:
                System.out.println("Invalid value,enter a word valid.");
        }
    }
}
