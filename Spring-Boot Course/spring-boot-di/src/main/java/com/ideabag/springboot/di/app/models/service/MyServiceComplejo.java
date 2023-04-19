package com.ideabag.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("myServiceComplejo")
public class MyServiceComplejo implements IService {
    public String operacion() {
        return "Ejecutando algún proceso importante complicado...";
    }
}
