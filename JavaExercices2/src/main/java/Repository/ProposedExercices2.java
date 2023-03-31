package Repository;

//EXERCICE 2
//In a company there are 5 employees whose salaries range between $100 and $500,
// write a program that reads the salaries each employee earns and reports how many employees
// earn between $100 and $300 and how many earn more than $300.
// In addition, the program must inform the amount that the company spends on salaries to the personnel.

import java.util.Scanner;

public class ProposedExercices2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cant1 = 0;
        int cant2 = 0;
        int salary = 0;
        int totalSalary = 0;

        for (int x = 0; x < 5; x++) {
            System.out.println("Enter the salary (100-500): ");
            salary = sc.nextInt();
            if (salary <= 300) {
                cant1++;
            } else {
                cant2++;
            }
            totalSalary += salary;
        }

        System.out.println("Workers with salaries between $100-$300 are: " + cant1);
        System.out.println("Workers with a salary of more than $300 are: " + cant2);
        System.out.println("The total cost of the company is: " + totalSalary);
        sc.close();
    }
}
