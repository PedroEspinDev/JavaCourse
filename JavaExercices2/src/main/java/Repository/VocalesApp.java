package Repository;

public class VocalesApp {
    public static void main(String[] args) {

        String nombre = "La lluvia en Sevilla es una maravilla";
        int contador = 0;

        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == 'a' ||
                    nombre.charAt(i) == 'e' ||
                    nombre.charAt(i) == 'i' ||
                    nombre.charAt(i) == 'o' ||
                    nombre.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " vocales ");
    }
}
