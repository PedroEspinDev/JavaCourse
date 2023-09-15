package patrones.factory.producto;

import patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa gruesa";
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Pepperoni");
        ingredientes.add("Aceitunas negras");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinamos por 30min. a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortamos la pizza en pequeñas porciones rectangulares");
    }
}
