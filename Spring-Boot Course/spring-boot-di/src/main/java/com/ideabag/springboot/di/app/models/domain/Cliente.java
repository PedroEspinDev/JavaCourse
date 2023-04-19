package com.ideabag.springboot.di.app.models.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Setter
@Getter
@Component
public class Cliente {

    @Value("${cliente.name}")
    private String name;

    @Value("${cliente.surname}")
    private String surname;
}
