package Repository;

import javax.swing.*;

public class ArrayRandomNum {

    public static void main(String[] args) {

        //Indicamos el tamaño
        String texto = JOptionPane.showInputDialog("Introduce un tamaño");
        int num[] = new int[Integer.parseInt(texto)];

        //Invocamos las funciones
        rellenarNumAleatorioArray(num, 0, 9);
        mostrarArray(num);
    }

    public static void rellenarNumAleatorioArray(int[] lista, int a, int b) {
        for (int i = 0; i < lista.length; i++) {

            //Generamos un número entre los parametros pasados
            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}
