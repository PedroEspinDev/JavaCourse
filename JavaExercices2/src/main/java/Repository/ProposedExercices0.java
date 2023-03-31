package Repository;

import java.util.Scanner;

//EXERCICE 0
//Write a program that reads 10 student grades and tells us how many have grades greater than or equal to 7 and how many have less.
public class ProposedExercices0 {
    public static void main(String[] args) {

        int x = 1;
        int cant1 = 0;
        int cant2 = 0;
        int grades = 0;
        Scanner sc = new Scanner(System.in);
        while (x <= 10) {
            System.out.println("Enter your grade: ");
            grades = sc.nextInt();
            if (grades >= 7) {
                cant1++;
            } else {
                cant2++;
            }
            x++;
        }
        System.out.println("The number of students with grades equal to or greater than 7 are: " + cant1);
        System.out.println("The number of students with grades lower than 7 are: " + cant2);
        sc.close();
    }
}
