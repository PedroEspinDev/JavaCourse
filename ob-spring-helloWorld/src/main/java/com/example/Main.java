package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Opción 1. Crear un objeto de forma normal.
        Calculadora service = new Calculadora();

        //Opción 2. Recibir un objeto de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        String text = calculadora.helloWorld();
        System.out.println(text);

        Calculadora calculator2 = (Calculadora) context.getBean("calculadora");
        text = calculadora.helloWorld();
        System.out.println(text);

    }
}
