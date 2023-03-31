package Repository;

//EXERCICE7
//Make a program that accumulates (adds) values entered by keyboard until 9999 is entered (do not add said value, it only indicates that the load has finished).
// Print the accumulated value and inform if said value is zero, greater than zero or less than zero.

import java.util.Scanner;

public class ProposedExercices7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        do {
            System.out.println("Enter a number (9999 to finish): ");
            num = sc.nextInt();
            if (num != 9999) {
                sum += num;
            }

        } while (num != 9999);
        System.out.println("The accumulated value is: " + sum);

        if (sum == 0) {
            System.out.println("The value is equal to 0");
        } else if (sum > 0) {
            System.out.println("The value is greater than 0");
        } else {
            System.out.println("The value is less than 0");
        }
    }
}
