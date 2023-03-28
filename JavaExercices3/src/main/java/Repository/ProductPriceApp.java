package Repository;

//Realiza un programa que lea por consola nombres de productos y precios (en decimal) hasta
//introducir como nombre de producto “fin”. Al acabar mostrará el nombre y precio del
//producto más caro y más barato. En caso de empate se mostrará el último producto
//introducido de los que compartieran el precio máximo y/o mínimo.

import java.util.Scanner;

public class ProductPriceApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        String maxName = "";
        String minName = "";
        Double price;
        Double maxPrice = Double.MIN_VALUE;
        Double minPrice = Double.MAX_VALUE;

        do {
            System.out.print("Introduzca el nombre del producto (o 'fin' para terminar): ");
            name = sc.next();
            if (!name.equalsIgnoreCase("fin")) {
                System.out.print("Introduzca el precio del producto: ");
                price = sc.nextDouble();

                if (price > maxPrice) {
                    maxPrice = price;
                    maxName = name;
                } else if (price == maxPrice) {
                    maxName = name;
                }

                if (price < minPrice) {
                    minPrice = price;
                    minName = name;
                } else if (price == minPrice) {
                    minName = name;
                }
            }
        } while (!name.equalsIgnoreCase("fin"));

        System.out.println("Producto más caro: " + maxName + " (" + maxPrice + ")");
        System.out.println("Producto más barato: " + minName + " (" + minPrice + ")");
    }
}