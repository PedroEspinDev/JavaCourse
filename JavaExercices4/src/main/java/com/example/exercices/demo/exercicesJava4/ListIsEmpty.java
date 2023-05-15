package com.example.exercices.demo.exercicesJava4;

import java.util.ArrayList;
import java.util.List;

public class ListIsEmpty {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);

        Boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
