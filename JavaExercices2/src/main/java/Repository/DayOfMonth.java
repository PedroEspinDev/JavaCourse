package Repository;

import java.util.Scanner;

//Define la clase DayOfMonth que pide dos enteros, que representarán un mes y un año.

public class DayOfMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month;
        int year;

        System.out.println("Introduzca el mes (1-12): ");
        month = sc.nextInt();
        System.out.println("Introduzca el año: ");
        year = sc.nextInt();

        int daysInMonth = calculateDaysInMonth(month, year);
        System.out.println("El mes " + month + " del año " + year + " tiene " + daysInMonth + " días.");
    }

    public static int calculateDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
