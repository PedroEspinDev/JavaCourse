package Repository;

import java.util.Scanner;

//EXERCICE 1
//A set of 5 heights of people are entered by keyboard. Show the average height of people.

public class ProposedExercices1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 1;
        int sum = 0;

        while (x <= 5) {
            System.out.println("Enter a height (in cm): ");
            int height = 0;
            height = sc.nextInt();
            sum = sum + height;
            x++;
        }
        int average = sum / 5;
        System.out.println("The average height is: "+ average+" cm");
        sc.close();
    }
}

