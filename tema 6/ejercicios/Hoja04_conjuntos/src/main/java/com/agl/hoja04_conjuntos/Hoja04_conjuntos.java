/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.agl.hoja04_conjuntos;

/**
 *
 * @author damt119
 */
public class Hoja04_conjuntos {

    public static void main(String[] args) {
       
        Mundo m1 = new Mundo();
        
        m1.añadirPais("España");
        m1.añadirPais("Italia");
        m1.añadirPais("Francia");
        m1.añadirPais("Italia");
        m1.añadirPais("Polonia");
        
        m1.borrarPais("españa");
        
        System.out.println("Estos son los paises");
        m1.mostrarPaises();
        
    }
}
