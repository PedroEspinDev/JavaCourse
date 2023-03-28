package com.example.demo.Repository;

import java.util.Scanner;

import com.example.demo.Repository.DiasSemana;

public class DiaSemanalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduzca día de la semana: ");
            String dia = scanner.next();

            DiasSemana diasS = DiasSemana.valueOf(dia.toUpperCase());
            switch (diasS) {
                case LUNES:
                case MARTES:
                case MIERCOLES:
                case JUEVES:
                case VIERNES:
                    System.out.println("El dia " + diasS.toString().toLowerCase() + " es laborable.");
                    break;
                case SABADO:
                case DOMINGO:
                    System.out.println("El dia " + diasS + " no es un dia laborable.");
                    break;
                default:
                    System.out.println("ERROR!: introduce un dia de la semana valido!");
                    break;
            }
        } catch (IllegalArgumentException error) {
            System.out.println("ERROR!: introduce un dia de la semana valido!");
        }
    }
}

