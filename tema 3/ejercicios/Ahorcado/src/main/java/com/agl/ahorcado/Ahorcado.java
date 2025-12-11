/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.ahorcado;

import java.util.Arrays;

/**
 *
 * @author damt119
 */
public class Ahorcado {

    public static void main(String[] args) {

        String[] palabras = {"fresa", "vainilla", "chocalate"};
        String palabra = palabras[(int) (Math.random() * 3)];
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=palabra;
            System.out.println(palabras[i]);
        }
        
        
        
        
        String guion=guiones(palabras);
        System.out.println(guion);
        
        
        
        //switch (palabra) {
        //case 1:
        //System.out.println("fresa");
        //break;
        //case 2:
        //System.out.println("vainilla");
        //break;
        //case 3:
        //System.out.println("chocalate");
        //break;
        //default:
        //} 
    }

    public static String guiones(String[] guiones) {

        String guion=("_");
        for (int i = 1; i < guiones.length; i++) {
            guiones[i] = guion;
        }

        return guion;

    }
}
