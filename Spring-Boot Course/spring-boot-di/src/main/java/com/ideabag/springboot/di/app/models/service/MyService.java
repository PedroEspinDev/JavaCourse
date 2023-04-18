package com.ideabag.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("myServiceSimple")
public class MyService implements IService {
    public String operacion() {
        return "Ejecutando algún proceso importante...";
    }

    


}
