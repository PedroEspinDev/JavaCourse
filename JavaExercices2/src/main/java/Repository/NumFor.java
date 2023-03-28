package Repository;

import java.util.Scanner;

public class NumFor {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        int positive = 0;
        int negative = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Write a number: ");
            num = sc.nextInt();

            if (num >= 0)
                positive++;
            else
                negative--;
            sum = sum + num;
        }
        System.out.println("The addition is: " + sum);
        System.out.println("The number of positives is: " + positive);
        System.out.println("The number of negatives is: " + negative);
    }
}