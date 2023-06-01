package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);
        ICocheRepository repository = context.getBean(ICocheRepository.class);

        System.out.println("El num de coches en base de datos es: " + repository.count());

        // Crear y almacenar un coche en base de datos
        Coche toyota = new Coche(null, "Toyota", "Prius", 2010);
        repository.save(toyota);

        System.out.println("EL num de coches en base de datos es : " + repository.count());

        // Recuperar un coche por id
        System.out.println(repository.findAll());


    }

}
