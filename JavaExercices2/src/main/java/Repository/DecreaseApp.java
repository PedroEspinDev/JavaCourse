package Repository;

//Define la clase IncreasingApp.
// Utilizando las tres estructuras de repetición (while,do while y for),
// genera la serie del 0 a 1000 con un decremento de 25 (ambos incluídos).

public class DecreaseApp {
    public static void main(String[] args) {

        System.out.println("-------DECREASE WHIT while METHOD---------");
        int i = 0;
        while (i >= (-1000)) {
            System.out.print(i + " ");
            i -= 25;
        }
        System.out.println();
        System.out.println("-------DECREASE WHIT do-while METHOD-------");

        int j = 0;
        do {
            System.out.print(j + " ");
            j -= 25;
        } while (j >= (-1000));

        System.out.println();
        System.out.println("------DECREASE WHIT for METHOD------");

        for (int k = 0; k >= (-1000); k -= 25) {
            System.out.print(k + " ");
        }
    }
}

