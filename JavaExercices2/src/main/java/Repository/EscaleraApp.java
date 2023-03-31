package Repository;
import javax.swing.JOptionPane;

public class EscaleraApp {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Escribe una altura");
        int altura=Integer.parseInt(texto);
        dibujaEscalera(altura);
    }

    public static void dibujaEscalera (int altura){
        for (int numeroasteriscos=1;numeroasteriscos<=altura;numeroasteriscos++){

            for(int i=0;i<numeroasteriscos;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}