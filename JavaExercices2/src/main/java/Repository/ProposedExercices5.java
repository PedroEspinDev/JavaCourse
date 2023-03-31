package Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//EXERCICE 5
//Write a program that allows you to load two lists of 3 values each.
// Inform with a message which of the two lists has a greater accumulated value (messages 'List 1 greater', 'List 2 greater', 'Equal lists')
//Keep in mind that there can be two or more repeating structures in an algorithm.

public class ProposedExercices5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println("Enter 3 values for list 1: ");
        for (int i = 0; i < 3; i++) {
            int value = sc.nextInt();
            list1.add(value);
        }
        System.out.println("Enter 3 values for list 2: ");
        for (int i = 0; i < 3; i++) {
            int value = sc.nextInt();
            list2.add(value);
        }
        int sumList1 = 0;
        for (int i = 0; i < list1.size(); i++) {
            sumList1 += list1.get(i);
        }

        int sumList2 = 0;
        for (int i = 0; i < list2.size(); i++) {
            sumList2 += list2.get(i);
        }
        if (sumList1 > sumList2) {
            System.out.println("List 1 is greater");
        } else if (sumList2 > sumList1) {
            System.out.println("List 2 is greater");
        } else {
            System.out.println("Lists are the same");
        }
    }
}
