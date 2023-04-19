package com.ideabag.springboot.di.app;

import com.ideabag.springboot.di.app.models.domain.ItemFactura;
import com.ideabag.springboot.di.app.models.domain.Producto;
import com.ideabag.springboot.di.app.models.service.IService;
import com.ideabag.springboot.di.app.models.service.MyService;
import com.ideabag.springboot.di.app.models.service.MyServiceComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("myServiceSimple")
    @Primary
    public IService registrarMyService() {
        return new MyService();
    }
    @Bean("myServiceComplejo")
    public IService registrarMyServiceComplejo() {
        return new MyServiceComplejo();
    }
    @Bean("itemFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Mancuernas", 100);
        Producto producto2 = new Producto("Bicicleta Estática", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 4);
        ItemFactura linea2 = new ItemFactura(producto2, 2);

        return Arrays.asList(linea1,linea2);
    }
}
