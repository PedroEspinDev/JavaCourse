package com.ideabag.springboot.di.app.models.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ItemFactura {

    private Producto producto;

    private Integer cantidad;
}
