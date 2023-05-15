package com.example.exercices.demo.exercicesJava4;


import java.time.LocalDate;

public class DateBeforeAnotherDate {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2012, 8, 22);
        LocalDate date2 = LocalDate.of(2023, 8, 22);

        boolean result = date1.compareTo(date2) < 0;
        System.out.println("Date 1 " + (result ? "is" : "not is") + " prior to the date 2.");
    }

}
