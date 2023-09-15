package patrones.factory.producto;

import patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa integral gruesa";
        salsa = "Salsa de tomate y rucula";
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinamos por 30min. a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortamos la pizza en pequeñas porciones triangulares");
    }
}
