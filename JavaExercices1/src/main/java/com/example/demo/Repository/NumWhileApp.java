package com.example.demo.Repository;

public class NumWhileApp {
    public static void main(String[] args) {

        for (int num=1;num<=100;num++){
            if (num%2==0 || num%3==0){
                System.out.println(num);
            }
        }
    }
}
