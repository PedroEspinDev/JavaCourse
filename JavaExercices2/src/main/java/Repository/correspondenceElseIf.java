package Repository;

import java.util.Scanner;

public class correspondenceElseIf {
    public static void main(String[] args) {

        Double note;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your note: ");
        note = sc.nextDouble();

        while (note < 0 || note > 10) {
            System.out.println("The note is invalid, please enter another: ");
            note = sc.nextDouble();
        }
        if (note < 5)
            System.out.println("Enough");
        else if (note >= 5 && note < 6)
            System.out.println("Approbed");
        else if (note >= 6 && note < 7)
            System.out.println("Good");
        else if (note >= 7 && note < 8)
            System.out.println("Remarkable bass");
        else if (note >= 8 && note < 9)
            System.out.println("Remarkable high");
        else if (note >= 9 && note < 10)
            System.out.println("Outstanding");
        else
            System.out.println("With honors");
    }
}