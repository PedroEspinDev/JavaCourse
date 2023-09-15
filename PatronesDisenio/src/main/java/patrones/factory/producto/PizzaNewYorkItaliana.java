package patrones.factory.producto;

import patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinamos por 30min. a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortamos la pizza en porciones cuadradas");
    }
}
