/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl._en_raya;

import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class tresEnRaya {

    public static void main(String[] args) {

        String tablero[][] = new String[3][3];
        int contador = 0;
        inicializaTablero(tablero);
        showTablero(tablero);

        juegaPlayer("X", tablero);
        showTablero(tablero);

    }

    public static void inicializaTablero(String[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = "_";
            }
        }
    }

    public static void showTablero(String[][] tablero) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void juegaPlayer(String ficha, String[][] tablero) {
        Scanner teclado = new Scanner(System.in);
        int fila, columna;

        System.out.println("El jugador al que le toca es: ");

        do {
            System.out.println("Introduce la fila");
            fila = teclado.nextInt();
        } while (fila < 0 || fila > 2);

        do {
            System.out.println("Introduce una columna");
            columna = teclado.nextInt();
        } while (columna < 0 || columna > 2);

        if (tablero[fila][columna].equals("_")) {
            tablero[fila][columna] = ficha;
        } else {
            System.out.println("Posicion ocupada en el tablero");
        }

    }

    public static boolean evaluateWin(String[][] tablero) {

        if (true) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {

                }
            }
            System.out.println("Ganas");
        } else if (true) {

        } else if (true) {

        } else if (true) {

        }

        return true;
    }
}
