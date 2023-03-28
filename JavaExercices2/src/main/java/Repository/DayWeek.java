package Repository;

import java.util.Scanner;

//Write a Java program that reads a number from the keyboard and shows what day of the week it corresponds to.
//
//If the number read is 1 it will display Monday, if it is 2 it will display Tuesday, if it is 3 it will display Wednesday, and so on...
//
//For any other value it will display Invalid.

public class DayWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.println("Entrer a number: ");
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("Sunday");
        } else System.out.println("Invalida value!");
    }
}


