package Repository;
//EXERCICES 6
//Develop a program that allows 5 integers to be loaded and then tells us how many values were even and how many were odd.
//Use the operator "%" in the condition of the conditional structure.
//if (value%2==0)
//The "%" operator returns the remainder of the division value / 2. For example: 12 % 2, returns 0; 13 % 2, returns 1, because the remainder of dividing 13 by 2 is 1.

import java.util.Scanner;

public class ProposedExercices6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        System.out.println("Enter 5 whole numbers: ");
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Pair numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
