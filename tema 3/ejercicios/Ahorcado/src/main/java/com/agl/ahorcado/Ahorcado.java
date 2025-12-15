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

        String buscarLetra, texto;
        int posicion;

        texto = palabra;
        buscarLetra = letra;

        posicion = texto.indexOf(buscarLetra);

        if (posicion > 0) {
            System.out.println("Letra correcta");
            posicion = texto.indexOf(letra, posicion + 1);
        } else {
            System.out.println("Letra incorrecta");
        }

    }

    public static void mostrarGuiones(char[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
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
