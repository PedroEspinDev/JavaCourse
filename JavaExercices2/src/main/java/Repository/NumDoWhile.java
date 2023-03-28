package Repository;

import java.util.Scanner;

//Make a Java program that asks for 10 numbers on the keyboard, makes the sum of those 10 numbers passed on the keyboard,
// counts the positive numbers and counts the negative numbers.
// Use <<do-while>>

public class NumDoWhile {
    public static void main(String[] args) {

        int num = 0;
        int account = 0;
        int sum = 0;
        int positive = 0;
        int negative = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Write a number: ");
            num = sc.nextInt();
            account++;

            if (num >= 0)
                positive++;
            else
                negative--;
            sum = sum + num;

        } while (account < 10);
        System.out.println("The addition is: " + sum);
        System.out.println("The number of positives is: " + positive);
        System.out.println("The number of negatives is: " + negative);
    }
}
