package Repository;

//Create a console program that allows you to perform the following operations:
//
//a) Create a class that allows capturing the name, surname, gender, age,
//these properties should be defined using the Private access modifier and
//allow the created object instance to be made directly by using a constructor method.
//b) Create a method that allows Capturing and returning the name and gender of 5 people captured by keyboard.
//c) Carry out a method that allows returning the average of the ages captured.
//d) Carry out a method that allows returning the number of people with the Male gender.
//e) Carry out a method that allows the return of the number of people with the Female gender.

import Entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListApp {
    public static void main(String[] args) {

        int amountUsers = 4;
        List<User> users = new ArrayList();

        for (int i = 0; i < amountUsers; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter user data: ");
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Surname: ");
            String surname = sc.next();
            System.out.println("Gender (M/F): ");
            String gender = sc.next();
            System.out.println("Age: ");
            int age = sc.nextInt();

            User userEntered = new User(name, surname, gender, age);
            users.add(userEntered);
        }
        returnNameGender(users);
        returnAverageAge(users);
        returnGenderMan(users);
        returnGernderWoman(users);
    }

    public static void returnNameGender(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("User " + (i + 1) + " --->Name: " + users.get(i).getName() + " " + users.get(i).getSurname() + ",Gender: " + users.get(i).getGender());
        }
    }

    public static void returnAverageAge(List<User> users) {
        double additionAge = 0.0;
        for (int i = 0; i < users.size(); i++) {
            additionAge = additionAge + (double) users.get(i).getAge();
        }
        double average = additionAge / users.size();
        System.out.println("The average age is: " + average);
    }

    public static void returnGenderMan(List<User> users) {
        int amountMale = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getGender().equals("M")) {
                amountMale = amountMale + 1;
            }
        }
        System.out.println("The number of male people is: " + amountMale);
    }

    public static void returnGernderWoman(List<User> users) {
        int amountFemale = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getGender().equals("F")) {
                amountFemale = amountFemale + 1;
            }
        }
        System.out.println("The number of female people is: " + amountFemale);
    }
}

