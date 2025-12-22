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
        boolean gana=false;

        inicializaTablero(tablero);
        showTablero(tablero);
        
        
        int turno=0;
        
        
        
        do {
            if (turno%2==0) {

                System.out.println("¿Donde quieres mover, Jugador X?");
                juegaPlayer("X", tablero);
                showTablero(tablero);
                gana = evaluateWin(tablero);
                turno++;
            } else if (turno%2==1) {
                System.out.println("¿Donde quieres mover, Jugador 0?");
                juegaPlayer("0", tablero);
                showTablero(tablero);
                gana = evaluateWin(tablero);
                turno++;
            }
            
            
        } while (gana==false || turno<9);

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

        //Ganan forma de fila
        if (!tablero[0][0].equals("_") && tablero[0][0].equals(tablero[0][1]) && tablero[0][1].equals(tablero[0][2])) {

            return true;
        }

        if (!tablero[1][0].equals("_") && tablero[1][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[1][2])) {

            return true;
        }

        if (!tablero[2][0].equals("_") && tablero[2][0].equals(tablero[2][1]) && tablero[2][1].equals(tablero[2][2])) {
            return true;
        }

        //ganan forma columna
        if (!tablero[0][0].equals("_") && tablero[0][0].equals(tablero[1][0]) && tablero[1][0].equals(tablero[2][0])) {
            return true;
        }

        if (!tablero[0][1].equals("_") && tablero[0][1].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][1])) {
            return true;
        }

        if (!tablero[0][2].equals("_") && tablero[0][2].equals(tablero[1][2]) && tablero[1][2].equals(tablero[2][2])) {
            return true;
        }

        //ganan en forma diagonal
        if (!tablero[0][0].equals("_") && tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2])) {
            return true;
        }

        if (!tablero[0][2].equals("_") && tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][0])) {
            return true;
        }

        return false;
    }

}
