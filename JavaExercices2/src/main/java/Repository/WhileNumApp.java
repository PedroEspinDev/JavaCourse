package Repository;

//Write a program that prints 25 terms of the series 11 - 22 - 33 - 44, etc. (Value are not entered by keyboard).
//Display the multiples of 8 up to the value 500.
// The display should show 8 -16 -24, etc.

public class WhileNumApp {
    public static void main(String[] args) {

        //Exercice 1

        int x = 1;
        int series = 11;
        while (series <= 100) {
            System.out.println(series);
            x++;
            series = series + 11;
        }
        System.out.println("====================");
        //Exercice 2

        int multiple = 8;
        while (multiple <= 500) {
            multiple = multiple + 8;
            System.out.println(multiple);
        }
    }
}
