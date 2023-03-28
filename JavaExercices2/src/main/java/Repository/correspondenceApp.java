package Repository;

//Write a Java program that performs the correspondence between note and value.
//
//Enough –>5
//Good –>6
//Remarkable bass –>7
//Remarkable high –>8
//Outstanding –>9
//Honors –>10
//Fail –> values less than 5
//Note –> values greater than 10

import java.util.Scanner;

public class correspondenceApp {
    public static void main(String[] args) {

        int note = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,enter your note: ");
        note = sc.nextInt();

        switch (note) {

            case 5:
                System.out.println("Enough");
                break;
            case 6:
                System.out.println("Good");
                break;
            case 7:
                System.out.println("Remarkable bass");
                break;
            case 8:
                System.out.println("Remarkable high");
                break;
            case 9:
                System.out.println("Outstanding");
                break;
            case 10:
                System.out.println("Honors");
                break;
            default:
                if (note < 5) {
                    System.out.println("Suspense,you need to study more!");
                } else {
                    System.out.println("Thumbs up, well done!");
                }
        }
    }
}
