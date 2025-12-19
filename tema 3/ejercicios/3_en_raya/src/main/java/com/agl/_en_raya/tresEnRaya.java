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
        Scanner teclado = new Scanner(System.in);

        String tablero[][] = new String[3][3];

        inicializaTablero(tablero);
        showTablero(tablero);

        System.out.println("Introduce la fila");
        String fila=teclado.next();
        System.out.println("Introduce una columna");
        String columna=teclado.next();
        
        juegaPlayer(fila,tablero);
        juegaPlayer(columna,tablero);

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

        int fila=0;
        int columna=1;
        
        if (fila==1) {
            ficha="X";
            tablero[fila][columna]=ficha;
        } else if (columna==0) {
            ficha="O";
            tablero[fila][columna]=ficha;
        }

    }

    public static boolean evaluateWin(String[][] tablero) {

        if (true) {

        }

        return false;
    }
}
