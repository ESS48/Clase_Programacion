/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl._en_raya;

/**
 *
 * @author damt119
 */
public class tresEnRaya {

    public static void main(String[] args) {

        String tablero[][] = new String[3][3];

        inicializaTablero(tablero);
        showTablero();
    }

    public static void inicializaTablero(String[][] tablero) {

        char[][] guiones = new char[tablero.length][tablero.length];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                guiones[i][j] = '_';
                System.out.print(guiones[i][j] + " ");
            }
        }

    }

    public static void showTablero(String[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j]="X";
                System.out.print(tablero[i][j]+" ");
            }
        }
        
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]="O";
                System.out.print(tablero[i][j]+" ");
            }
        }
        
    }

    public static void juegaPlayer(String ficha, String tablero) {
        
        //char[][] ficha = new char[tablero.length][tablero.length];
        
        //if (true) {
            //for (int i = 0; i < tablero.length; i++) {
                //for (int j = 0; j < tablero[0].length; j++) {
                    //ficha[i][j]='X';
                    //System.out.println(tablero[i][j]);
                //}
            //}
        //} else if (true) {
            //for (int i = 0; i < tablero[0].length; i++) {
                //for (int j = 0; j < tablero.length; j++) {
                    //ficha[j][i]='O';
                    //System.out.println(tablero[j][i]);
                //}
            //}
        //}
        
    }
}
