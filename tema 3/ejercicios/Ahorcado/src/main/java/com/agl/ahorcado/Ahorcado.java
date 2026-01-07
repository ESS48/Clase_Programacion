/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.ahorcado;

import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Ahorcado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] palabras = {"fresa", "vainilla", "chocalate"};
        String palabra = palabras[(int) (Math.random() * 3)];

        System.out.println("La palabra para ver cual es: " + palabra);

        // array para los guiones.
        char[] guiones = new char[palabra.length()];

        for (int i = 0; i < guiones.length; i++) {
            guiones[i] = '_';
        }
        mostrarGuiones(guiones);

        System.out.println("Inserta una letra: ");
        String letra = teclado.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            char letra2 = palabra.charAt(i);
            
            System.out.println(letra2);
            
        }
        
        //ejercicio 4
        
        
        
        //ejercicio 5
        int vidas = 6;
        
        
        //ejercicio 6
        
        
        
        //ejercicio7
                
        
        
    }

    private static void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
                }
                System.out.println("__________");
                break;
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" | |");
                System.out.println(" | |");
                System.out.println(" | -------");
                System.out.println(" | | - - |");
                System.out.println(" | | o |");
                System.out.println(" | -------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(" |");
                }
                System.out.println("__________");
                break;
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" | |");
                System.out.println(" | |");
                System.out.println(" | -------");
                System.out.println(" | | - - |");
                System.out.println(" | | o |");
                System.out.println(" | -------");
                System.out.println(" | | ");
                System.out.println(" | | ");
                System.out.println(" | | ");
                System.out.println(" | | ");
                System.out.println(" | | ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
                }
                System.out.println("__________");
                break;
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" | |");
                System.out.println(" | |");
                System.out.println(" | -------");
                System.out.println(" | | - - |");
                System.out.println(" | | o |");
                System.out.println(" | -------");
                System.out.println(" | | ");
                System.out.println(" | / | ");
                System.out.println(" | / | ");
                System.out.println(" | / | ");
                System.out.println(" | | ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
                }
                System.out.println("__________");
                break;
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" | |");
                System.out.println(" | |");
                System.out.println(" | -------");
                System.out.println(" | | - - |");
                System.out.println(" | | o |");
                System.out.println(" | -------");
                System.out.println(" | | ");
                System.out.println(" | / | \\ ");
                System.out.println(" | / | \\ ");
                System.out.println(" | / | \\ ");
                System.out.println(" | | ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
                }
                System.out.println("__________");
                break;
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" | |");
                System.out.println(" | |");
                System.out.println(" | -------");
                System.out.println(" | | - - |");
                System.out.println(" | | o |");
                System.out.println(" | -------");
                System.out.println(" | | ");
                System.out.println(" | / | \\ ");
                System.out.println(" | / | \\ ");
                System.out.println(" | / | \\ ");
                System.out.println(" | | ");
                System.out.println(" | / ");
                System.out.println(" | / ");
                System.out.println(" | / ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
                }
                System.out.println("__________");
                break;
            case 0:
                System.out.println(" ---------------------");
                System.out.println(" | |");
                System.out.println(" | |");
                System.out.println(" | -------");
                System.out.println(" | | X X |");
                System.out.println(" | | o |");
                System.out.println(" | -------");
                System.out.println(" | | ");
                System.out.println(" | / | \\ ");
                System.out.println(" | / | \\ ");
                System.out.println(" | / | \\ ");
                System.out.println(" | | ");
                System.out.println(" | / \\");
                System.out.println(" | / \\ ");
                System.out.println(" | / \\ ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
                }
                System.out.println("__________");

                System.out.println("GAME OVER");
                break;
        }
    }

    public static void mostrarGuiones(char[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    //Pruebas
    //for (int i = 0; i < palabras.length; i++) {
    //palabras[i] = palabra;
    //System.out.println(palabras[i]);
    //}
    //public static String guiones(String[] guiones) {
    //String guion = "_";
    //int G = Integer.parseInt(guion);
    //for (int i = 1; i < guiones.length; i++) {
    //System.out.println(guiones.charAt(i));
    //}
    //return guion;
    //}{

}
