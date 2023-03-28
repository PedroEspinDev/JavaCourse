package Repository;

import java.util.Scanner;

//Write a Java program that reads two numbers from the keyboard and displays the smaller of them.
// If the two numbers are the same, it should display a message stating so.

public class MinNumElseIf {
    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num1 = sc.nextInt();
        System.out.println("Enter other number: ");
        num2 = sc.nextInt();

        if (num1 < num2)
            System.out.println(num1 + " is less than " + num2);
        else if (num1 > num2)
            System.out.println(num2 + " is less than " + num1);
        else
            System.out.println("The numers are the same. ");
    }
}
