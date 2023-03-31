package Repository;

import javax.swing.*;

public class PiramideInversaApp {
    public static void main(String[] args){
        String texto = JOptionPane.showInputDialog("Escriba la altura");
        int altura = Integer.parseInt(texto);
        dibujarPiramide(altura);

    }
    public static void dibujarPiramide(int altura){
        for (int numeroespacios = 0, numeroasteriscos = (altura*2)-1; numeroasteriscos > 0 ; numeroespacios++, numeroasteriscos-=2){
            //Espacios
            for (int i=0; i<numeroespacios;i++){
                System.out.print(" ");
            }
            //Asteriscos
            for (int j=numeroasteriscos; j!=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
