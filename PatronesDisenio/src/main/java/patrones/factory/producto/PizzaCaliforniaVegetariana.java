package patrones.factory.producto;

import patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {
    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza Vegetariana California";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Cebolla");
        ingredientes.add("Espinacas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25min. a 180ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza en triángulos" );
    }
}
