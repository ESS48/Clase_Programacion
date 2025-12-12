/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Ahorcado {

    public static void main(String[] args) {

        String[] palabras = {"fresa", "vainilla", "chocalate"};
        String palabra = palabras[(int) (Math.random() * 3)];

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabra;
            System.out.println(palabras[i]);
        }
        
        String guion = "_";
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabra;
            System.out.print(palabra=guion+" ");
        }
        
        
        
        //char[]secreto;
    }

    //public static String guiones(String[] guiones) {
        //String guion = "_";
        //int G = Integer.parseInt(guion);

        //for (int i = 1; i < guiones.length; i++) {
            //System.out.println(guiones.charAt(i));
        //}

        //return guion;

    //}
}
