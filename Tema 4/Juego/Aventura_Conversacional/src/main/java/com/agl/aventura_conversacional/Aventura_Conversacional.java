/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.agl.aventura_conversacional;

import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Aventura_Conversacional {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Juego juego=new Juego();
        
        juego.introduccicon();
        
        System.out.println("Elige una opcion entre los cuatro caminos: ");
        opcion=teclado.nextInt();
        juego.menu(opcion);
    }
}
