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

        int palabra = (int) Math.floor(Math.random() * (3 - 1 + 1)) + 1;

        String[] palabras={"fresa","vainilla","chocalate"};
        
        switch (palabra) {
            case 1:
                System.out.println("fresa");
                break;
            case 2:
                System.out.println("vainilla");
                break;
            case 3:
                System.out.println("chocalate");
                break;
            default:
        } 
        
        String[] ahorcado = new String[palabra];
        String[] guion = guiones(ahorcado);
        System.out.println(Arrays.toString(guion));
    }
    
    public static String[] guiones(String[] guiones) {

        for (int i = 1; i < guiones.length; i++) {
            guiones[i] = ("_");
        }

        return guiones;

    }
}
