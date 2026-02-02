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
        Scanner teclado=new Scanner(System.in);
        int opcion;
        
        Juego juego=new Juego();
        
        juego.introduccicon();
        
        System.out.println("¿Que camino que quieres elegir?");
        opcion=teclado.nextInt();
        
        switch(opcion){
            case 1:
                juego.escena1();
                break;
            case 2:
                juego.escena2();
            
            default:
                System.out.println("¡OYE!, ese camino no existe");
        }
        
        

    }
}
