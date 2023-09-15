package patrones.factory.ejemplo;

import patrones.factory.PizzaProducto;
import patrones.factory.PizzeriaCaliforniaFactory;
import patrones.factory.PizzeriaNewYorkFactory;
import patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("Tim ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("Barbara ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Alfredo ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Richard ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
