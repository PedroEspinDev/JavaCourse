package patrones.factory;

import patrones.factory.producto.PizzaNewYorkItaliana;
import patrones.factory.producto.PizzaNewYorkPepperoni;
import patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "italiana" -> new PizzaNewYorkItaliana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            default -> null;
        };
    }
}

