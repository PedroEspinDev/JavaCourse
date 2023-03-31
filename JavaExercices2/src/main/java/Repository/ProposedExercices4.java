package Repository;

//EXERCICE 4
//Display the multiples of 10 up to the value 1500.
//It should appear on the screen 10 - 20 -30 etc.
public class ProposedExercices4 {
    public static void main(String[] args) {

        int series = 10;
        for (int i = 0; i < 1500; i++) {
            System.out.println(series + " ");
            series += 10;
        }
    }
}
