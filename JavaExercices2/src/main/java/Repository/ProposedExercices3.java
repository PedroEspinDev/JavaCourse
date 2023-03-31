package Repository;

//EXERCICES 3
//Write a program that prints 20 terms of the series 5 - 10 - 15 - 20, etc. (Values are not entered by keyboard)
public class ProposedExercices3 {
    public static void main(String[] args) {

        int serie = 5;
        for (int i = 0; i <= 20; i++) {
            System.out.println(serie);
            serie += 5;
        }
    }
}
