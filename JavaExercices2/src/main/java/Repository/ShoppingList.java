package Repository;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        List<String> listProducts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String product = "";

        while (!product.equals("end")) {
            System.out.println("Add a product: (type \"end\" to exit)");
            product = sc.nextLine();
            if (!product.equals("end")) {
                listProducts.add(product);
            }
        }
        System.out.println("The products introduced are: ");
        for (String p : listProducts) {
            System.out.println("-" + p);
        }
    }
}
