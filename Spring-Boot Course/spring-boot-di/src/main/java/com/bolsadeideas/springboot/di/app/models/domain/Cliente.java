package com.bolsadeideas.springboot.di.app.models.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@RequestScope
public class Cliente {

	@Value("${cliente.nombre}")
	private String nombre;

	@Value("${cliente.apellido}")
	private String apellido;

}
