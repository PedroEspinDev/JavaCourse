package com.example.demo.Repository;

import java.util.Scanner;

public class MesApp {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        Mes[] meses = Mes.values();

        System.out.println("Escribe un numero de dias");
        int dias = sn.nextInt();

        for (int i = 0; i < meses.length; i++) {

            if (meses[i].getNumDias() == dias) {
                System.out.println(meses[i].toString());
            }
        }
    }
}
